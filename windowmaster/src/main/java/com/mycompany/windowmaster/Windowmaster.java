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
        float numberOfWindows;
        float costOfWindow;
        float costOfWindowTrim;
        
        String stringHeight;
        String stringWidth;
        String stringNumberOfWindows;
        String stringCostOfWindow;
        String stringCostOfWindowTrim;
        
        float areaOfWindow;
        float cost;
        float perimeterOfWindow;
        
        Scanner myScanner = new Scanner(System.in);
        
        System.out.println("Enter window height:");
        stringHeight = myScanner.nextLine();
        System.out.println("Enter window width:");
        stringWidth = myScanner.nextLine();
        System.out.println("Enter number of windows");
        stringNumberOfWindows = myScanner.nextLine();
        System.out.println("Enter cost of window(s)");
        stringCostOfWindow = myScanner.nextLine();
        System.out.println("Enter cost of trim");
        stringCostOfWindowTrim = myScanner.nextLine();
        
        height = Float.parseFloat(stringHeight);
        width = Float.parseFloat(stringWidth);
        numberOfWindows = Float.parseFloat(stringNumberOfWindows);
        costOfWindow = Float.parseFloat(stringCostOfWindow);
        costOfWindowTrim = Float.parseFloat(stringCostOfWindowTrim);
        
        areaOfWindow = numberOfWindows * (height * width);
        perimeterOfWindow = numberOfWindows * 2 * (height + width);
        
        cost = ((costOfWindow * areaOfWindow) + (costOfWindowTrim * perimeterOfWindow));
        
        System.out.println("Number of windows = " + stringNumberOfWindows);
        System.out.println("Cost of window = " + costOfWindow);
        System.out.println("Cost of window trim = " + costOfWindowTrim);
        System.out.println("Window height = " + stringHeight);
        System.out.println("Window width = " + stringWidth);
        System.out.println("Window area = " + areaOfWindow);
        System.out.println("Window perimeter = " + perimeterOfWindow);
        System.out.println("Total Cost = " + cost);
    }
}
