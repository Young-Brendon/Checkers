/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package checkers;

import java.util.Scanner;

/**
 *
 * @author Brendon
 */
public class SelectPlayersView {
    
    private Game game;
    private Player[] playerList;

    public SelectPlayersView(Game game) {
        this.game = game;
        playerList = Checkers.getPlayerList();
    }

    
    public boolean getInput() {
        
        this.displayNameList(); // display the list of names
        
        System.out.println("\tPlease enter the number of the first player.");
        // get first players name
        Player player1 = this.getPlayer();
        if (player1 ==  null) {
            return false;
        }            

        // get the second players name
        System.out.println("\tPlease enter the number of the second player.");
        Player player2 = this.getPlayer();
        if (player2 ==  null) {
            return false;
        }       
        
        return true;
        
    }
    

    public Player getPlayer() {
        
        Scanner inFile = Checkers.getInputFile();
        Player player = null;        
        
        boolean valid = false;
        while (!valid) {
            String strNumber = inFile.nextLine();
            
            if (strNumber.length() < 1) { // was a value entered ?
                new CheckersError().displayError(
                        "You must enter a number associated with the name or "
                        + "enter a \"Q\" to quit. Try again.");
                continue;
            }
            
            strNumber = strNumber.trim(); // trim off all blanks from front and back    
            strNumber = strNumber.substring(0, 1); // get only the first character
            
            if (strNumber.toUpperCase().equals("Q")) { // quit?
                return null;
            }
                    
            if (!strNumber.matches("[0-9]+")) { // is the value entered a number?
                new CheckersError().displayError(
                        "You must enter a number associated with the name or "
                        + "enter a \"Q\" to quit. Try again.");
                continue;
            }
            
            int numberSelected = Integer.parseInt(strNumber); // convert string to integer
            
            // is the number outside the range of the list of names
            if (numberSelected < 1  ||  numberSelected > this.playerList.length) {
                new CheckersError().displayError(
                        "Invalid number. You must enter a number between "
                        + "1 and " + this.playerList.length 
                        + "or enter a \"Q\" to quit. Try again.");
                continue;
            }
            
            player = this.playerList[numberSelected-1]; // get the player from the list            
            
            valid = true; // valid name selected
      
        } while (!valid);
        
        return player;
    }
    
    
    public void displayNameList() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tSelect the players who will be playing the game.");
        System.out.println("\tEnter the number of a player below:");

        for (int i = 0; i < this.playerList.length; i++) {
            int namePosition = i+1;
            System.out.println("\t   " + namePosition + "\t" + playerList[i].name);
        }
        System.out.println("\t===============================================================\n");
    }   
    
}    

