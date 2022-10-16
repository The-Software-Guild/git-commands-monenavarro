/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.scanner;

/**
 *
 * @author JulianAcosta
 */
import java.util.Scanner;

public class MiniMadLibs {
    public static void main(String[] args) {
        Scanner inputReader = new Scanner(System.in);
        System.out.println("LET'S PLAY MAD LIBS!");
        
        System.out.println("Enter a noun: ");
        String one = inputReader.nextLine();
        
        System.out.println("Enter an adjective: ");
        String two = inputReader.nextLine();
        
        System.out.println("Enter another noun: ");
        String three = inputReader.nextLine();
        
        System.out.println("Enter a number: ");
        String four = inputReader.nextLine();
        
        System.out.println("Enter another adjective: ");
        String five = inputReader.nextLine();
        
        System.out.println("Enter a plural noun: ");
        String six = inputReader.nextLine();
        
        System.out.println("Enter another plural noun: ");
        String seven = inputReader.nextLine();
        
        System.out.println("Enter your last plural noun: ");
        String eight = inputReader.nextLine();
        
        System.out.println("Enter a verb (infinitive form): ");
        String nine = inputReader.nextLine();
        
        System.out.println("Enter the same verb (past principle): ");
        String ten = inputReader.nextLine();
        
        System.out.println("*** NOW LET'S GET MAD (libs) ***");
        System.out.println(one + ": the " + two + " frontier.");
        System.out.println("These are the voyages of the starship: " + three);
        System.out.println("Its " + four + "-year mission: to explore strange " + five + " " + six + ", to seek out red " + seven + " and red " + eight + ".");
        System.out.println("And to boldly " + nine + " where no one has " + ten + " before.");
         
    }
}
