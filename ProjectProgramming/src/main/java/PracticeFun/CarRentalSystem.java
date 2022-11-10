/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticeFun;

/**
 *
 * @author MonicaNavarro
 */
public class CarRentalSystem {
    
    public static void main(String[] args) {
	Mercedes mercedes = new Mercedes("A Class", "silver");
		
	Driver Monica = new Driver("Monica");
		
	Monica.setCar(mercedes);
	Monica.drive();

    }
}
