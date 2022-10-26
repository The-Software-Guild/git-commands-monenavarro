/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.dvdlibrary.dto;

/**
 *
 * @author MonicaNavarro
 */
public class DVDLibraryException extends Exception {
    
    public DVDLibraryException(String message) {
        super(message);
    }
    
    public DVDLibraryException(String message, Throwable cause) {
        super(message, cause);
    }
}
