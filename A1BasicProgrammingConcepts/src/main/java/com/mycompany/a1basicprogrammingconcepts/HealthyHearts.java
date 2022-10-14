/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.a1basicprogrammingconcepts;

/**
 *
 * @author JulianAcosta
 */
import java.util.*;

public class HealthyHearts {
    
    /**
     * ask user to input their age
     * calculate healthy heart rate range for age
     * return the healthy range
     * max heart rate is 220 - age
     * target heart rate zone is 50 - 85% of max
     */
    
    public static void main(String[] args) {
        // User to input their age
        System.out.println("Enter your age:");
        
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        
        // To calculate max HR
        int maximumHeartRate = 220 - age;
        System.out.println("Your maximum heart rate should be " + maximumHeartRate + " beats per minute.");
        
        // To calculate target heart rate zone
        double units = maximumHeartRate / 100;
        int fiftyPercent = (int) units * 50;
        int eightyFivePercent = (int) units * 85;
        System.out.println("Your target HR zone is " + fiftyPercent + " - " + eightyFivePercent + " bpm.");
        
    }
}
