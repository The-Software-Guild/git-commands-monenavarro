/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.flowcontrol.random;

/**
 *
 * @author JulianAcosta
 */
import java.util.Scanner;
import java.util.Random;

public class GuessMeMore {
    public static void main(String[] args) {
        
        int guess = 1000;
        
        Random numGenerator = new Random();
        int randNum = numGenerator.nextInt(201) - 100;
        
        System.out.println("I've chosen a number between -100 and 100. Bet you can't guess it!");
        Scanner guessNum = new Scanner(System.in);
        
        while (guess != randNum) {
            guess = guessNum.nextInt();
            
            System.out.println("You guessed: " + guess);
            
            if (guess == randNum) {
                System.out.println("Wow! Nice guess, you got it!");
                break;
            } else if (guess > randNum) {
                System.out.println("Ha, nice try - too high! Try again!");
            } else {
                System.out.println("Ha, nice try - too low! Try again!");
            }
        }
    }
    
}
