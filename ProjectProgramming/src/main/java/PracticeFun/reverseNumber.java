/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticeFun;

/**
 *
 * @author MonicaNavarro
 */
public class reverseNumber {
    public static void main(String[] args) {
        
        int number = 123456789;
        int reverseNum = 0;
        
        while (number != 0)
            
        {reverseNum = reverseNum * 10;
                reverseNum = reverseNum + number % 10;
                number = number / 10;
        }
        System.out.println("Reversed number = " + reverseNum);
    }
    
}
