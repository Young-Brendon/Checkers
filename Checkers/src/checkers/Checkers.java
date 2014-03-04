
package checkers;

import java.util.Scanner;

/**
 * * @author Angela and Brendon
 */
public class Checkers {
    
    private static final Scanner inFile = new Scanner(System.in);
    
    private static Player[] playerList;
    
      String welcomeMsg =
              "\n\t***********************************************************************"
            + "\n\t* Welcome to the game of Checkers!                                    *"
            + "\n\t* You will be playing against a partner. The object of the game       *"
            + "\n\t* is to move all of your pieces to the other end of the board         *"
            + "\n\t* while removing as many of your opponents pieces as possible.        *"
            + "\n\t*                                                                     *"
            + "\n\t* Good Luck!!!                                                        *"
            + "\n\t***********************************************************************"
            + "\n";
      
      

    public Checkers(){
        
    }
    
    public static Scanner getInputFile() {
        return Checkers.inFile;
    }
    
    public static Player[] getPlayerList() {
        return playerList;
    }
    
    public static void setPlayerList(Player[] playerList) {
        Checkers.playerList = playerList;
    }
   
    public static void main(String[] args) {        
        
        Checkers checkers = new Checkers();       
        checkers.display();
        
        MainMenuView mainMenuView = new MainMenuView();
        mainMenuView.getInput();      
        
    }
    
    private void display() {
        System.out.println(this.welcomeMsg);
    }  
}