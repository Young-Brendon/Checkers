package byui.cit260.checkers.views;

import byui.cit260.checkers.models.Board;
import byui.cit260.checkers.controls.Checkers;
import byui.cit260.checkers.enums.ErrorType;

import byui.cit260.checkers.models.Game;
import byui.cit260.checkers.interfaces.EnterInfo;
import java.awt.Point;
import java.util.Scanner;
import java.util.regex.Pattern;
/**
 * @author Angela
 */
public class GetLocationView implements EnterInfo {
    
    private Game game;
    
    @Override
    public Object getInput(Object object) {
        this.game = (Game) object;
        Scanner inFile = Checkers.getInputFile(); 
        
        System.out.println("\n\n\t" + game.getCurrentPlayer().getName() + " it is your turn."
                + " Enter a row and column number (For example: 1 3)");

        // read the row and column coordinates
        String[] coordinates;
        Point location = null;
        
        boolean valid = false;

        do {
            String strRowColumn = inFile.nextLine(); // read in row and column
            strRowColumn = strRowColumn.trim(); // trim all blanks from front and end
                
            strRowColumn = strRowColumn.replace(',', ' '); // replace commas with a blank
            coordinates = strRowColumn.split("\\s"); // tokenize the string

            if (coordinates.length < 1) { // no coordinates specified
                 ErrorType.displayErrorMsg(ErrorType.ERROR109.getMessage());
                continue;
            }

            else if (coordinates.length == 1) { // only one coordinate
                if (coordinates[0].toUpperCase().equals("Q")) { // Quit?
                    return null;
                } else { // wrong number of values entered.
                   ErrorType.displayErrorMsg(ErrorType.ERROR109.getMessage());
                    continue;
                }
            }

            // user java regular expression to check for valid integer number?
            Pattern digitPattern = Pattern.compile(".*\\D.*");
            if (digitPattern.matcher(coordinates[0]).matches() ||
                digitPattern.matcher(coordinates[1]).matches()
               ) {
                ErrorType.displayErrorMsg(ErrorType.ERROR109.getMessage());
                continue;
            }
            
            int row = Integer.parseInt(coordinates[0]);
            int column = Integer.parseInt(coordinates[1]);
            
            Board board = game.getBoard();
            if (row < 1 || row > board.getRowCount() ||
                column < 1 || column > board.getColumnCount()) {
            ErrorType.displayErrorMsg(ErrorType.ERROR109.getMessage());
                continue;
            }

            location = new Point(row-1, column-1);
            valid = true;

        } while (!valid);
        
        return location;
            
    }

}
/*
    
    public GetLocationView(Game game) {
        this.game = game;
    }
    
    
    /*
* Prompt the user to enter the location (row and column) to place their
* marker on the board
* @Param game the object representing the game

    public Point getInput() {

        Scanner inFile = Checkers.getInputFile(); // get input file
        String[] coordinates;
        Point location = null;
        
        boolean valid = false;
        

        // prompt the use to enter the locaton to placeread the row and column coordinates
        while (!valid) {
            // prompt for the row and column numbers
            System.out.println("\n\n\t" + "Player 1 it is your turn."
                + " Enter a row and column number (For example: 1 3)");
            
            // get the value entered by the user
            String strRowColumn = inFile.nextLine();
            
            // trim off all extra blanks from the input
            strRowColumn = strRowColumn.trim();
            
            // replace any commas enter with blanks
            strRowColumn = strRowColumn.replace(',', ' ');
            
            // tokenize the string into an array of words
            coordinates = strRowColumn.split("\\s");

            if (coordinates.length < 1) { // the value entered was not blank?
                new CheckersError().displayError(
                        "You must enter two numbers, a row and the column, "
                        + "or a \"Q\" to quit. Try again.");
                continue;
            }

            else if (coordinates.length == 1) { // only one coordinate entered?
                if (coordinates[0].toUpperCase().equals("Q")) { // Quit?
                    return null;
                } else { // wrong number of values entered.
                    new CheckersError().displayError(
                        "You must enter two numbers, a row and the column, "
                        + "or a \"Q\" to quit. Try again.");
                    continue;
                }
            }
            
            // user java regular expression to check for valid integer number
            // for both numbers
            String regExpressionPattern = ".*\\d.*";
            if (!coordinates[0].matches(regExpressionPattern) ||
                !coordinates[1].matches(regExpressionPattern)) {
                new CheckersError().displayError(
                        "You must enter two numbers, the number of rows and columns, "
                        + "or a \"Q\" to quit. Try again.");
                continue;
            }
            
            // convert each of the cordinates from a String type to
            // an integer type
            int row = Integer.parseInt(coordinates[0]);
            int column = Integer.parseInt(coordinates[1]);
                     
            Board board = this.game.board; // get the game board
            
            // Check for invalid row and column entered
            if (row < 1 || row > board.rowCount ||
                column < 1 || column > board.columnCount) {
                new CheckersError().displayError(
                        "Enter a valid number of rows and columns from 3 to 10. Try again.");
                continue;
            }
            
            // create a Point object to store the row and column coordinates in
            location = new Point(row-1, column-1);
            
            // check to see if the location entered is already occupied
            if (board.locationOccupied(location)) {
                new CheckersError().displayError(
                    "The current location is taken. Select another location");
                continue;
            }

            valid = true; // a valid location was entered
            System.out.println(row);  System.out.println(column);
        }
        
        return location;
            
    }

}*/