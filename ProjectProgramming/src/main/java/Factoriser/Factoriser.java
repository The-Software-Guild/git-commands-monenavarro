/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Factoriser;

/**
 *
 * @author JulianAcosta
 */

import java.util.*;

public class Factoriser {
    
    public static void main(String[] args) {
        
        // ask for user to input an number
        int n, i;
        System.out.println("What number do you want to factor?");
        Scanner factoriser = new Scanner(System.in);
        n = factoriser.nextInt(); 
        
        // return the original number
        System.out.println("The factors of " + n + " are:");
        
        // print each factor of the inputted number
        for (i = 1; i <= n; ++i) {
            if (n % i == 0) {
                System.out.print(i + " ");
              
            }
            
            
        }
    }
}
