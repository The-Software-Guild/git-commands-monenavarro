/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticeFun;

/**
 *
 * @author MonicaNavarro
 */
import java.util.*;

public class Main {
    public static void main(String[] args) {
        
        // instantiate egg object
        Eggs myEggs = new Eggs();
        
        // to obtain user input
        Scanner myScanner = new Scanner(System.in);
       
        System.out.println("How many eggs do you want to sort?");
        String UI = myScanner.nextLine();
        int userInput = Integer.parseInt(UI);
        
        // set number of eggs
        myEggs.setEggs(userInput);
        
        // call egg methods
        System.out.println("There are " + myEggs.getDozen() +
                            " dozens. There are " + myEggs.getGross() + " gross sets and " 
                            + myEggs.getExtras() + " extra eggs!");
    }
}
