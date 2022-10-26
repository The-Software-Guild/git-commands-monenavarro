/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.sg.dvdlibrary.ui;

/**
 *
 * @author MonicaNavarro
 */
import com.sg.dvdlibrary.dto.DVD;
import java.util.List;
import java.util.Set;

public class DVDLibraryView {
    
    UserIO io;
    
    public DVDLibraryView(UserIO io) {
        this.io = io;
    }
    
    public int printMenuAndGetSelection() {
        io.print("Main Menu");
        io.print("1. Add a DVD");
        io.print("2. Delete a DVD");
        io.print("3. Edit DVD information");
        io.print("4. List all DVDs in library");
        io.print("5. Display DVD by Title");
        io.print("6. Quit");
        
        return io.readInt("Please select from the options above.", 1, 6);
    }
    
    public DVD getNewDVDInfo() {
        String title = io.readString("Please enter the DVD title");
        String releaseDate = io.readString("Please enter the release date");
        String mpaaRating = io.readString("Please enter the MPAA rating");
        String director = io.readString("Please enter the director");
        String studio = io.readString("Please enter the studio");
        String userComment = io.readString("Please enter your review and comments");

        DVD currentDVD = new DVD(title);
        currentDVD.setReleaseDate(releaseDate);
        currentDVD.setmpaaRating(mpaaRating);
        currentDVD.setDirector(director);
        currentDVD.setStudio(studio);
        currentDVD.setuserComment(userComment);

        return currentDVD;
    }

    public void displayAddDVDBanner() {
        io.print("=== Add a DVD ===");
    }

    public void displayAddSuccessBanner() {
        io.readString(
                "DVD successfully added.  Please hit enter to return to main menu.");
    }

    public void displayEditDVDBanner() {
        io.print("=== Edit DVD ===");
    }

    public void displayDVDList(List<DVD> dvdList) {
        int counter = 0;
        for (DVD currentDVD : dvdList) {
            counter++;
            io.print("\nDVD #" + counter);
            displayFormattedDetails(currentDVD);
        }
        io.readString("Please hit enter to return to main menu.");
    }

    public void displayDisplayAllBanner() {
        io.print("=== Displaying All DVDs ===");
    }

    public void displayDVDBanner() {
        io.print("=== Display DVD ===");
    }

    public String getDVDTitleChoice() {
        return io.readString("Please enter the DVD Title.");
    }
//

    public void displayDVD(DVD currentDVD) {
        if (currentDVD != null) {
            displayFormattedDetails(currentDVD);
        } else {
            io.print("DVD not found.");
        }
        io.readString("Please hit enter to return to main menu.");
    }

    public int displayEditMenuDVD(DVD currentDVD) {
        if (currentDVD != null) {
            displayFormattedDetails(currentDVD);
            io.print("7.Save changes\n"
                    + "8.Exit editor and return to main menu (unsaved changes will be lost).\n");
        } else {
            io.print("DVD does not exist.");
        }
        return getEditFieldChoice();
    }

    public int getEditFieldChoice() {
        return io.readInt("Please enter the number of the field you would like to edit: ", 1, 8);
    }

    public String editDVD(int menuChoice) {
        
        switch (menuChoice) {
            case 1:
                return io.readString("Please enter a new title: ");
            case 2:
                return io.readString("Please enter a new release date: ");
            case 3:
                return io.readString("Please enter a new rating: ");
            case 4:
                return io.readString("Please enter a new director: ");
            case 5:
                return io.readString("Please enter a new studio: ");
            case 6:
                return io.readString("Please enter new comments: ");
            default:
                throw new AssertionError(); //better to use unknown command
        }
    }

    public void displayReturningToMainMenu() {
        io.print("Please wait. Returning to main menu...");
    }

    public void displayRemoveDVDBanner() {
        io.print("=== Delete a DVD ===");
    }

    public void displayRemoveSuccessBanner() {
        io.readString("DVD successfully deleted. Please hit enter to return to main menu.");
    }
//

    public void displayExitBanner() {
        io.print("THANK YOU! C YA LATER ALLIGATOR!");
    }

    public void displayUnknownCommandBanner() {
        io.print("ERROR! UNKNOWN COMMAND. PLEASE TRY AGAIN.");
    }

    public void displayErrorMessage(String errorMsg) {
        io.print("=== ERROR ===");
        io.print(errorMsg);
    }

    public void displayChangesSaved() {
        io.print("=== Changes saved ===");
    }

    public void displayFormattedDetails(DVD currentDVD) {
        io.print("1.Title: " + currentDVD.getTitle() + "\n"
                + "2.Release Date: " + currentDVD.getReleaseDate() + "\n"
                + "3.MPAA Rating: " + currentDVD.getmpaaRating() + "\n"
                + "4.Director: " + currentDVD.getDirector() + "\n"
                + "5.Studio: " + currentDVD.getStudio() + "\n"
                + "6.Notes: " + currentDVD.getuserComment());
    }
}
