/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package InterestCalculator;

/**
 *
 * @author JulianAcosta
 */
import java.util.*;
import java.text.DecimalFormat;

public class InterestCalculator {
    
    private static final DecimalFormat df = new DecimalFormat("0.00");
    
    public static void main(String[] args) {
        
        double investMoney;
        double yearlyInterestRate;
        double numYearsToInvest;
        
        Scanner scan = new Scanner(System.in);
        
        System.out.println("How much do you want to invest?");
        investMoney = scan.nextInt();
        
        System.out.println("How many years are you investing?");
        yearlyInterestRate = scan.nextInt();
        
        System.out.println("What is the annual interest rate % growth?");
        numYearsToInvest = scan.nextInt();
        
        // calculate the investment money at the start and end of year
        for (int i = 1; i <= numYearsToInvest; i++) {
            
            double total = (investMoney * Math.pow((1 + yearlyInterestRate / 400), 4 * 1));
        
        // print expected output
        System.out.println("Calculating...");
        System.out.println("Year " + i);
        System.out.println("Began with $" + df.format(investMoney));
        System.out.println("Earned $" + df.format(total - investMoney));
        System.out.println("Ended with $" + df.format(total));
        System.out.println("");
        
        investMoney = total;
    }
    
    scan.close();
    
    }
}
