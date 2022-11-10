/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PracticeFun;

/**
 *
 * @author JulianAcosta
 */
public class Line implements Drawable, Fillable {
    
    private String drawingColour, fillingColour;
    private int thickness, size;

    public Line(String drawingColour, String fillingColour, int thickness, int size) {
        this.drawingColour = drawingColour;
        this.fillingColour = fillingColour;
        this.thickness = thickness;
        this.size = size;
    }

    @Override
    public void drawingColor() {
       
    }

    @Override
    public void thickness() {
       
    }

    @Override
    public void fillingColour() {
        
    }

    @Override
    public void size() {
        
    }
    
}
