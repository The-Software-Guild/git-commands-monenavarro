/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticeFun;

/**
 *
 * @author JulianAcosta
 */
public class Driver {
    
    private String name;
	private Car car;
	
	public Driver(String name) {
		super();
		this.name = name;
	}

	public void setCar(Car car) {
		this.car = car;
	}
	
	public void drive() {
		System.out.print(name+" is driving a "+car.getColor()+" color "+car.getModel()+", and the ");
		car.engine();
	}
}
