/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.windowmaster;

import java.util.Scanner;

/**
 *
 * @author JulianAcosta
 */
public class Windowmaster {

    public static void main(String[] args) {
        float height;
        float width; 
        
        String stringHeight;
        String stringWidth;
        
        float areaOfWindow;
        float cost;
        float perimeterOfWindow;
        
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("Enter window height:");
        stringHeight = myScanner.nextLine();
        System.out.println("Enter window width:");
        stringWidth = myScanner.nextLine();
        
        height = Float.parseFloat(stringHeight);
        width = Float.parseFloat(stringWidth);
        
        areaOfWindow = height * width;
        perimeterOfWindow = 2 * (height + width); 
    }
}
