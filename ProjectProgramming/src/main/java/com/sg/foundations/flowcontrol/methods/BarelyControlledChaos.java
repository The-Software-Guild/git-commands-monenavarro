/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.flowcontrol.methods;

/**
 *
 * @author JulianAcosta
 */
import java.util.Random;

public class BarelyControlledChaos {
    
    public static void main(String[] args) {
        String colour = getColour();
        String animal = getAnimal();
        String colourAgain = getColour();
        int weight = getNum(100, 10000);
        int distance = getNum(10, 50) ;
        int number = getNum(50000, 100000);
        int time = getNum(30, 60);
        
        System.out.println("Once, when I was very small...");
        
        System.out.println("I was chased by a " + colour + ", " + weight + "lb " + "miniature " + animal + " for over " + distance + " miles!" );
        
        System.out.println("I had to hide in a field of over " + number + " " + colourAgain + " poppies for nearly " + time + " hours until it left me alone!");
        
        System.out.println("\nIt was QUITE the experience, " + "let me tell you!");   
        
    }
    
    public static String getColour() {
        String[] colours = {"red", "green", "purple", "blue"};
        
        Random random = new Random();
        int selection = random.nextInt(colours.length);
        
        return colours[selection];
    }
    
    public static String getAnimal() {
        String[] animals = {"lion", "pig", "elephant", "tiger", "dog"};
        
        Random random = new Random();
        int selection = random.nextInt(animals.length);
        
        return animals[selection];
    }
    
    public static int getNum(int min, int max) {
        Random random = new Random();
        return random.nextInt(max - min + 1) + min;
    }
}
