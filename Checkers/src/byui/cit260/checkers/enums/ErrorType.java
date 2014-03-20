/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package byui.cit260.checkers.enums;

/**
 *
 * @author Cody
 */
public enum ErrorType {
     ERROR101 ("There is no active game. "
                    + "You must start a new game before you can take a turn"),
    
    ERROR102 ("\tA name must be at least one character long. Try again."
              + "or a \"Q\" to quit. Try again."),
    ERROR103 ("You must start a new game first."),
    
    ERROR104 ("GameCommands - regularTurn: location is null"),
    
    ERROR105 ("Invalid command. Please enter a valid command."),
    
    ERROR106 ("You must start a new game first."),
    
    ERROR107 ("You must enter a name or enter a \"Q\" to quit. Try again."),
    
    ERROR108 ("The game parameter is null."),
    
    ERROR109 ("You must enter two numbers, a row and the column, "
              + "or a \"Q\" to quit. Try again."),
    
    ERROR201 ("No empty locations found on the board"),
    ERROR202 ("You must enter a number in the list. Try again."),
    
    ERROR203 ("This location is already occupied. Try a different "
              + "location."),
    
    ERROR204 ("Enter a non-blank character for the player's marker."),
    
    ERROR205 ("Both players can not use the same character for a marker."),
    
    ERROR206 ("There is no active game. You must start a new game before "
              + "you can take a turn"), 
    
    ERROR207 ("The number of rows must be between 3 - 9 and the "
              + "number of columns must be between 3 - 9 "),
    
    ERROR209 ("GameCommands - takeTurn: invalidPlayerTYpe");


    
    String message;
    
    ErrorType(String message) {
        this.message = message;
    }
    
    public String getMessage() {
        return this.message;
    }

    
    public static void displayErrorMsg(String errorMessage) {
        String fullMessage = "\t+ ERROR: " + errorMessage + " +";
        int dividerLineLength = fullMessage.length();
        StringBuilder dividerLine = new StringBuilder(dividerLineLength);
        for (int i = 0; i < dividerLineLength; i++) {
            dividerLine.insert(i, '+');
        }
        System.out.println("\t" + dividerLine.toString());
        System.out.println(fullMessage);
        System.out.println("\t" + dividerLine.toString());
    
    
    
  
}
    
}
