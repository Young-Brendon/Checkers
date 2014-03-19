
package byui.cit260.checkers.controls;

import byui.cit260.checkers.views.MainMenuView;
import byui.cit260.checkers.views.HelpMenuView;
import byui.cit260.checkers.models.Player;
import java.util.Scanner;

/**
 * * @author Angela and Brendon
 */
public class Checkers {
    
    private static final Scanner inFile = new Scanner(System.in);
    private static final HelpMenuView helpMenu = new HelpMenuView();
        
    private static String[] nameList;
    
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
      
   private Player[] players = new Player[10];   

    public Checkers(){
        
    }
    
    public static Scanner getInputFile() {
        return Checkers.inFile;
    }
    
    public static HelpMenuView getHelpMenu() {
        return Checkers.helpMenu;
    }
    
    public static String[] getNameList() {
        return nameList;
    }
    
    public static void setNameList(String[] nameList) {
        Checkers.nameList = nameList;
    }
   
    public Player[] getPlayers() {
        return players;
    }
    
    public void setPlayers(Player[] players) {
        this.players = players;
    }
    
    public static void main(String[] args) {
        
        Checkers checkers = new Checkers();       
        checkers.display();
        Checkers.nameList = checkers.getPlayerNames();
        MainMenuView mainMenu = new MainMenuView();
        mainMenu.executeCommands(null);
        Checkers.inFile.close();  
    }
    
    private void display() {
        System.out.println(this.welcomeMsg);
    } 
    
    private String[] getPlayerNames() {
        
        String[] playerNames = new String[10];
        Scanner inFile = Checkers.getInputFile();
        
        System.out.println("\n\t---------------------------------------------------------------");
        System.out.println("\t Enter the names of those who will be playing Checkers. ");
        System.out.println("\t---------------------------------------------------------------");
        
        int playerIndex = 0;
        boolean done = false;
        while (playerIndex < 10 && !done) {
            System.out.println("\tPlease enter the name of a player or enter \"Q\" to quit.");
            String name;
            name = inFile.nextLine();
            name = name.trim();

            if (name.length() < 1) {
                new CheckersError().displayError("\tA name must be at least one character long. Try again.");
                continue;
            }

            if (name.toUpperCase().equals("Q")) { // quit?
                done = true;
                break;
            }
            
            // add name to list of player names
            playerNames[playerIndex] = name;
            playerIndex++;

        }
        
        String[] newNameList = new String[playerIndex];
        for (int i = 0; i < playerIndex; i++) {
            newNameList[i] = playerNames[i];
        }
        
        sortList(newNameList);
        
        return newNameList;
    }
    
    public String[] sortList(String[] names) {
        String tmpName;
        boolean notDone = true;
        while(notDone) {
            
            notDone = false; // assume that you done
            for (int i = 0; i < names.length-1; i++) {
                int compareResult = names[i].compareTo(names[i+1]);
                if (compareResult > 0) {
                    // swap names
                    tmpName = names[i];
                    names[i] = names[i+1];
                    names[i+1] = tmpName;
                    notDone = true;
                }
            }
        }

        return names;
    }

    
}