/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.flowcontrol.arrays;

/**
 *
 * @author JulianAcosta
 */
import java.util.Random;

public class HiddenNuts {
    
    public static void main(String[] args) {
        
        String[] hidingSpots = new String[100];
        Random squirrel = new Random();
        hidingSpots[squirrel.nextInt(hidingSpots.length)] = "Nut";
        System.out.println("The nut has been hidden...");
        
        // a for loop to itereate through the hiding spots and to find the matching index
        for (int i = 0; i < hidingSpots.length; i++) {
            if ("Nut".equals(hidingSpots[i])) {
                System.out.println("Found it! It's in spot #" + i);
                break;
                
            } else {
                System.out.println("Keep looking!");
            }
        }
    }
}
