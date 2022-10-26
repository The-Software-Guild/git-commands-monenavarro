/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.sg.dvdlibrary.dao;

/**
 *
 * @author MonicaNavarro
 */
import java.util.List;
import com.sg.dvdlibrary.dto.DVD;
import com.sg.dvdlibrary.dto.DVDLibraryException;

public interface dvdLibraryDao {
    
    DVD addDVD(String DVD, DVD dvd) throws DVDLibraryException;
    
    List<DVD> getAllDVDs() throws DVDLibraryException;
    
    DVD getDVD(String dvdTitle) throws DVDLibraryException;
}
