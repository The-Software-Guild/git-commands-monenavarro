/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.dvdlibrary.ui;

/**
 *
 * @author MonicaNavarro
 */
public class DVDLibraryView {
    
    private UserIO io = new UserIOConsoleImpl();
    
    public int printMenuAndGetSelection() {
        io.print("Main Menu");
        io.print("1. List DVD Titles");
        io.print("2. Add New DVD");
        io.print("3. View a DVD");
        io.print("4. Delete a DVD Entry");
        io.print("5. Quit");
        
        return io.readInt("Please select from the options above.", 1, 5);
    }
}
