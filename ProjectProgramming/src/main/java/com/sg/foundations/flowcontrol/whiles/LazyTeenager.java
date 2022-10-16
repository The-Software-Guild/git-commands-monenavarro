/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.foundations.flowcontrol.whiles;

/**
 *
 * @author JulianAcosta
 */
import java.util.Random;

public class LazyTeenager {
    
    public static void main(String[] args) {
        
        int numTimesTold = 1;
        
        Random random = new Random();
        double randomValue = random.nextDouble();
        double chance = 0.0;
        
        do {
            numTimesTold++;
            
            System.out.println("Clean your room! (x" + numTimesTold + ")");
            chance += 0.1;
            
            if (numTimesTold == 7) {
                System.out.println("NO INTERNET FOR A WEEK!");
                break;
            }
            
            if (randomValue <= chance) {
                System.out.println("OKAY JEESH! I'LL DO IT!");
            }
        }
        while (randomValue > chance);
    }
    
}
