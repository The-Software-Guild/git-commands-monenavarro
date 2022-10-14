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

public class DogGenetics {
    
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        Random random = new Random();
        
        String dogName;
        int startingPercent = 100;
        int breedPercent = 0;
        
        System.out.println("What is your dog's name?");
        dogName = myScanner.nextLine();
        
        String[] breeds = {"German Shepherd", "Husky", "Pomeranian", "Collie", "Spaniel"};
        
        System.out.println("-----------------------------");
        System.out.println(dogName + " is a mix of: ");
        
        for (int i = 0; i < 5; i++) {
            String breed = "";
            breed = breeds[i];
            if (i != 4) {
                breedPercent = random.nextInt(startingPercent);
                startingPercent -= breedPercent;
            } else {
                breedPercent = startingPercent;
            }
            System.out.println(breed + ": " + breedPercent + "%");
        }
        System.out.println("\nWow, that's QUITE the dog!");
    }
    
}
