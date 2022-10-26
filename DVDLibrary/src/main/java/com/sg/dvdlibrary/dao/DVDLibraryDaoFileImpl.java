/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.dvdlibrary.dao;

import com.sg.dvdlibrary.dto.DVD;
import com.sg.dvdlibrary.dto.DVDLibraryException;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author MonicaNavarro
 */
public class DVDLibraryDaoFileImpl implements dvdLibraryDao {
    
    public static final String DVD_LIBRARY_CATALOGUE = "dvd_library_catalogue.txt";
    public static final String DELIMITER = "::";

    private Map<String, DVD> dvds = new HashMap<>();

    @Override
    public DVD addDVD(String title, DVD dvd) throws DVDLibraryException {
        DVD newDVD = dvds.put(title, dvd);
        writeDVD();
        return newDVD;
    }

    @Override
    public List<DVD> getAllDVDs() throws DVDLibraryException {
        loadDVDs();
        return new ArrayList<>(dvds.values());
    }

    @Override
    public DVD getDVD(String title) throws DVDLibraryException {
        loadDVDs();
        return dvds.get(title);
    }

    @Override
    public DVD removeDVD(String title) throws DVDLibraryException {
        DVD removedDVD = dvds.remove(title);
        writeDVD();
        return removedDVD;
    }

    private void loadDVDs() throws DVDLibraryException {
        Scanner scanner;

        try {
            // Create Scanner for reading the file
            scanner = new Scanner(new BufferedReader(new FileReader(DVD_LIBRARY_CATALOGUE)));
        } catch (FileNotFoundException e) {
            throw new DVDLibraryException(
                    "OOPS! Unable to load DVD data onto memory. Sorry!", e);
        }
        // currentLine holds the most recent line read from the file
        String currentLine;
        // currentTokens holds each of the parts of the currentLine after it has
        // been split on our DELIMITER
        // NOTE FOR APPRENTICES: In our case we use :: as our delimiter.  If
        // currentLine looks like this:
        // 1234::Joe::Smith::Java-September2013
        // then currentTokens will be a string array that looks like this:
        //
        // ___________________________________
        // |    |   |     |                  |
        // |1234|Joe|Smith|Java-September2013|
        // |    |   |     |                  |
        // -----------------------------------
        //  [0]  [1]  [2]         [3]
        String[] currentTokens;
        // Go through ROSTER_FILE line by line, decoding each line into a 
        // Student object.
        // Process while we have more lines in the file
        while (scanner.hasNextLine()) {
            // get the next line in the file
            currentLine = scanner.nextLine();
            // break up the line into tokens
            currentTokens = currentLine.split(DELIMITER);
            // Create a new DVD object and put it into the map of students
            // NOTE FOR APPRENTICES: We are going to use the DVD title
            // which is currentTokens[0] as the map key for our student object.
            // We also have to pass the DVD title into the DVD constructor
            DVD currentDVD = new DVD(currentTokens[0]);
            // Set the remaining vlaues on currentStudent manually
            currentDVD.setReleaseDate(currentTokens[1]);
            currentDVD.setmpaaRating(currentTokens[2]);
            currentDVD.setDirector(currentTokens[3]);
            currentDVD.setStudio(currentTokens[4]);
            currentDVD.setuserComment(currentTokens[5]);

            // Put currentDVD into the map using title as the key
            dvds.put(currentDVD.getTitle(), currentDVD);
        }
        // close scanner
        scanner.close();
    }

    private void writeDVD() throws DVDLibraryException {
        // NOTE FOR APPRENTICES: We are not handling the IOException - but
        // we are translating it to an application specific exception and 
        // then simple throwing it (i.e. 'reporting' it) to the code that
        // called us.  It is the responsibility of the calling code to 
        // handle any errors that occur.
        PrintWriter out;

        try {
            out = new PrintWriter(new FileWriter((DVD_LIBRARY_CATALOGUE), false));
        } catch (IOException e) {
            throw new DVDLibraryException(
                    "Could not save DVD data.", e);
        }

        List<DVD> DVDList = this.getAllDVDs();
        for (DVD currentDVD : DVDList) {
            // write the Student object to the file
            out.println(currentDVD.getTitle() + DELIMITER
                    + currentDVD.getReleaseDate() + DELIMITER
                    + currentDVD.getmpaaRating() + DELIMITER
                    + currentDVD.getDirector() + DELIMITER
                    + currentDVD.getStudio() + DELIMITER
                    + currentDVD.getuserComment());
            // force PrintWriter to write line to the file
            out.flush();
        }
        // Clean up
        out.close();
    }
    
}
