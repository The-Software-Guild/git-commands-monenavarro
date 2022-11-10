/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticeFun;

/**
 *
 * @author MonicaNavarro
 */
public class Eggs{
   
    private int eggs, dozen, gross, extras;


    public void setEggs(int eggs) {
        this.eggs = eggs;
    }

    public int getDozen() {
        dozen = eggs / 12;
        return dozen;
    }   

    public int getGross() {
        gross = eggs / 144;
        return gross;
    }
    

    public int getExtras() {
        extras = eggs % 12;
        return extras;
    }
    
     
    
    
}
