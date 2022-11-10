/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticeFun;

/**
 *
 * @author MonicaNavarro
 */
import java.lang.Math;

public class Height {
    
    private int inches, feet;

    public int getInches() {
        return inches;
    }

    public void setInches(int inches) {
        this.inches = inches;
    }

    public int getFeet() {
        return feet;
    }

    public void setFeet(int feet) {
        this.feet = feet;
    }
    /* Math.floorDiv is a method that returns the largest integer value that is less than or equal
       to the algebraic quotient
    */
    
    public void sumOfHeights(Height h1, Height h2) {
        int totalInchesH1 = h1.getInches() + (h1.getFeet() * 12);
        int totalInchesH2 = h2.getInches() + (h2.getFeet() * 12);
        int totalInches = totalInchesH1 + totalInchesH2;
        this.feet = Math.floorDiv(totalInches, 12);
        this.inches = totalInches % 12;
    }
    
}
