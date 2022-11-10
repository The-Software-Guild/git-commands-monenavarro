/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticeFun;

/**
 *
 * @author JulianAcosta
 */
public class Mercedes extends Car {
    
    public Mercedes(String model, String color) {
        super(model, color);
    }
    
    @Override
    public void engine() {
        System.out.println("Mercedes Engine goes VROOOOM!");
    }
}
