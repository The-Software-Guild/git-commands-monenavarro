/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticeFun;

/**
 *
 * @author MonicaNavarro
 */
public class Vehicle {
    
    protected String brand = "Tesla";
    public String colour = "Black";
    
    public void soundTheHorn() {
        System.out.println("BEEP BEEP!");
    }
}

class Car extends Vehicle {
    public String carModel = "S";
    
    public static void main(String[] args) {
        Car myCar = new Car();
        
        myCar.soundTheHorn();
        
        System.out.println(myCar.colour + " " + myCar.brand + " " + myCar.carModel );
    }
}
