/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.dvdlibrary.controller;

/**
 *
 * @author MonicaNavarro
 */

import com.sg.dvdlibrary.ui.UserIO;
import com.sg.dvdlibrary.ui.UserIOConsoleImpl;

public class DVDLibraryController {
    
    private UserIO io = new UserIOConsoleImpl();
    
    public void run() {
        boolean keepGoing = true;
        int menuSelection = 0;
        while (keepGoing) {
            io.print("Main Menu");
            io.print("1. List DVD Titles");
            io.print("2. Add New DVD");
            io.print("3. View a DVD");
            io.print("4. Delete a DVD Entry");
            io.print("5. Quit");
            
            menuSelection = io.readInt("Please select from the" + " options above.", 1, 5);
            
            switch (menuSelection) {
                case 1:
                    io.print("LIST DVDs");
                    break;
                case 2:
                    io.print("ADD A NEW DVD");
                    break;
                case 3:
                    io.print("VIEW A DVD");
                    break;
                case 4:
                    io.print("DELETE A DVD");
                    break;
                case 5:
                    keepGoing = false;
                    break;
                default:
                    io.print("ERROR! UNKNOWN COMMAND. PLEASE TRY AGAIN.");
                  
            }
        }
        io.print("C YA LATER ALLIGATOR");
    }
}
