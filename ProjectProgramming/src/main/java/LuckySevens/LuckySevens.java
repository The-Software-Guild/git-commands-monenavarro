/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package LuckySevens;

/**
 *
 * @author MonicaNavarro
 */
import java.util.*;

public class LuckySevens {

     public static void main(String []args){
        
        int dollars, dice1, dice2; 
        int best = 0, roll= 0, bestRoll = 0, bestDollars;
        
        Scanner scan = new Scanner(System.in);
        Random random = new Random();
        
        System.out.println("\nHow much money do you have?");
        dollars = scan.nextInt();
        bestDollars = dollars;
        
        dice1 = random.nextInt(6)+ 1;
        dice2 = random.nextInt(6)+ 1;
        
        while(dollars >= 1){

            roll++;
            
            if(dollars > bestDollars){
                
                bestDollars = dollars;
                best = (dice1 + dice2);
                bestRoll = (roll - 1);
                
            }
            
            dice1 = random.nextInt(6)+ 1;
            dice2 = random.nextInt(6)+ 1;
            
            System.out.println("Roll #" + roll + ": You have $" + dollars);
        
            if(dice1 + dice2 == 7){
            
                dollars += 4;
                
            
            } else {
            
                dollars -= 1;
                
            }
        }
        System.out.println("You went broke on Roll " + roll);
        System.out.println("You should have quit after " + bestRoll + " rolls. When you had $" + bestDollars);
    }
}
            
    


