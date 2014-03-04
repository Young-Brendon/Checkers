package checkers;

import java.util.Scanner;

/**
** @author Angela
*/
public class HelpMenuView {
    
    public static final String BOARD = "BOARD";
    public static final String GAME = "GAME";
    public static final String REAL_PLAYER = "REAL_PLAYER";
    public static final String COMPUTER_PLAYER = "COMPUTER_PLAYER";
    public static final String LOCATION = "LOCATION";
    public static final String MARKER = "MARKER";
        
    private final static String[][] menuItems = {
        {"B", "The board"},
        {"C", "A computer player"},
        {"G", "The Checkers game"},
        {"L", "A location"},
        {"M", "A marker"},
        {"R", "A regular player"},
        {"Q", "Quit Help"}
    };   
        
    public HelpMenuView() {
        
    }
    
    public final void display() {
        System.out.println("\n\t===============================================================");
        System.out.println("\tEnter the letter associated with one of the following commands:");

        for (int i = 0; i < HelpMenuView.menuItems.length; i++) {
            System.out.println("\t " + menuItems[i][0] + "\t" + menuItems[i][1]);
        }
        System.out.println("\t===============================================================\n");
    }
    
    private boolean validCommand(String command) {
        String[][] items = HelpMenuView.menuItems;

        for (String[] item : HelpMenuView.menuItems) {
            if (item[0].equals(command)) {
                return true;
            }
        }
        return false;
    }
    
    protected final String getCommand() {
        
        Scanner inFile = Checkers.getInputFile();
        String command;
        boolean valid = false;        
        do {
            
            command = inFile.nextLine();
            command = command.trim().toUpperCase();
            valid = validCommand(command);
            if (!validCommand(command)) {
                new CheckersError().displayError("Invalid command. Please enter a valid command.");
                continue;
            }
            
            } while (!valid);
        
        return command;
        
    }
    
    public String getInput(Object object) {
        
        String gameStatus = Game.PLAYING;
        
        do {
            this.display();
            String command = this.getCommand();
                
            switch (command) {
                case "B":
                    this.displayHelp(HelpMenuView.BOARD);
                    break;
                case "C":
                    this.displayHelp(HelpMenuView.COMPUTER_PLAYER);
                    break;
                case "G":
                    this.displayHelp(HelpMenuView.GAME);
                    break;
                case "L":
                    this.displayHelp(HelpMenuView.LOCATION);
                    break;
                case "M":
                    this.displayHelp(HelpMenuView.MARKER);
                    break;
                 case "R":
                    this.displayHelp(HelpMenuView.REAL_PLAYER);
                    break;
                case "Q":
                    return Game.QUIT;
                
            }
        } while (!gameStatus.equals(Game.QUIT));
        
         return gameStatus;
    }
    
    private void displayHelp(String helpType) {

        String helpText = null;
        switch (helpType) {
            case HelpMenuView.BOARD: helpText = 
                "\tThe game board for Checkers. It consist of a grid of "
                + "\n\tlocations. Players move their markers diagonally across "
                + "\n\tthe board in an effort to win the game. The default board is "
                + "\n\t8 rows by 8 columns.";
                break;
                
            case HelpMenuView.GAME: helpText = 
                "\tThe objective of the game is to be the first player to move all of "
                + "\n\ttheir markers diagonally across the board. Each player takes "
                + "\n\tturns moving their marker one square, or jumping diagonally over "
                + "\n\tanother player's marker. The opponents markers that are jumped "
                + "\n\tover are removed from the board. The first player to get all of "
                + "\n\ttheir markers (or all their remaining markers) to the other side "
                + "\n\tof the board is the winner.";
                break; 
                
            case HelpMenuView.REAL_PLAYER: helpText = 
                "\tA player takes their turn by moving a marker diagonally one space "
                + "\n\ton the board. A player may jump over the opposing player's "
                + "\n\tmarkers as many times as possible as long as they continue to "
                + "\n\tjump forward in a diagonal direction without skipping a square.";
                break;
                
            case HelpMenuView.COMPUTER_PLAYER: helpText = 
                "\tA computer based player is not available in this version.";
                break;
                
            case HelpMenuView.LOCATION: helpText = 
                "\tA location on the board where a player can place their marker";
                break;
                
            case HelpMenuView.MARKER: helpText = 
                "\tA symbol that \"marks\" the locations in the board that are occupied "
                + "by a player. "
                + "\n\tThe default markers are \"R\" and \"B\" which stands for Red and Black"
                + "\n\trespectively.";
                break;
        }   
        
        StringBuilder dividerLine = new StringBuilder(80);
        for (int i = 0; i < 80; i++) {
            dividerLine.insert(i, '~');
        }
        
        System.out.println("\t" + dividerLine.toString());
        System.out.println(helpText);
        System.out.println("\t" + dividerLine.toString());
    }

}

