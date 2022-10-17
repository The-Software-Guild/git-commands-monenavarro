/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.flowcontrol.fors;

/**
 *
 * @author MonicaNavarro
 */
import java.util.Scanner;

public class TraditionalFizzBuzz {
    
    public static void main(String[] args) {
        
        System.out.println("Enter FizzBuzz range: ");
        Scanner fizzbuzzScanner = new Scanner(System.in);
        int halt = fizzbuzzScanner.nextInt();
        
        for (int i = 0; i <= halt; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                System.out.println("FizzBuzz");
                
            } else if (i % 3 == 0 && i % 5 != 0) {
                System.out.println("Fizz");
                
            } else if ( i % 3 != 0 && i % 5 == 0) {
                System.out.println("Buzz");
                
            } else {
                System.out.println(i);
            }
            
        }
        System.out.println("TRADITION!!!");
    }
}
