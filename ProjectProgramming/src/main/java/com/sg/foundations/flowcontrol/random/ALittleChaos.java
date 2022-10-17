/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.flowcontrol.random;

/**
 *
 * @author MonicaNavarro
 */
import java.util.Random;

public class ALittleChaos {
    public static void main(String[] args) {
        
        Random randomiser = new Random();
                
        System.out.println("Random can make integers: " + randomiser.nextInt());
        System.out.println("Or a double: " + randomiser.nextDouble());
        System.out.println("Or even a boolean: " + randomiser.nextBoolean());
        
        int num = randomiser.nextInt(100);
        
        System.out.println("You can store a randomized result: " + num);
        System.out.println("And use it over and over again: " + num + ", " + num);

        System.out.println("Or just keep generating new values");
        System.out.println("Here's a bunch of numbers from 0 - 100: ");

        System.out.print(randomiser.nextInt(51) + 50);
        System.out.print(randomiser.nextInt(51) + 50);
        System.out.print(randomiser.nextInt(51) + 50);
        System.out.print(randomiser.nextInt(51) + 50);
        System.out.print(randomiser.nextInt(51) + 50);
        System.out.println(randomiser.nextInt(51));
    }
    
}
