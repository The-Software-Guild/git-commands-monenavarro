/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticeFun;

/**
 *
 * @author MonicaNavarro
 */
public class HeightMain {
    public static void main(String[] args) {
        
        Height h1 = new Height();
        h1.setFeet(5);
        h1.setInches(5);
        
        Height h2 = new Height();
        h2.setFeet(6);
        h2.setInches(13);
        
        Height h3 = new Height();
        h3.sumOfHeights(h1, h2);
        
        System.out.println(h3.getFeet() + " feet. " + h3.getInches() + " inches.");
    }
}
