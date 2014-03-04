package checkers;

import java.util.Scanner;
/**
 * * @author Angela
 */
public class MainMenuControl {
    
    public void createPlayerList() {
        
        GetPlayersListView getPlayersListView = new GetPlayersListView();
        String[] listOfPlayersNames = getPlayersListView.getInput();
        
        // create the list of players named
        Player[] playerList = new Player[listOfPlayersNames.length];
                               
        for (int i = 0; i < playerList.length; i++) {
            String playersName = listOfPlayersNames[i];
            Player newPlayer = new Player();
            newPlayer.name = playersName;
            // add new player to player list
            playerList[i] = newPlayer;          
        }
        
        Checkers.setPlayerList(playerList);
        
    }
       
    public void startGame(long noPlayers) {
        
        if (noPlayers != 1  &&  noPlayers != 2) {
            new CheckersError().displayError("startGame - invalid number of players specified.");
            return;
        }
        
        Game game;
        game = this.createGame("TWO_PLAYER");
        
        GameMenuView gameMenu = new GameMenuView(game);
        gameMenu.getInput();       
        
    }
    
    private Game createGame(String gameType) {
        
        Game game = null;
        Player playerA = null;
        Player playerB = null;
        
        if (gameType == null) {
            new CheckersError().displayError("MainCommands - create: gameType is null");
            return null;           
        
        }        
        
        playerA = new Player(Player.REGULAR_PLAYER, game.PLAYER_A_DEFAULT_MARKER);
        playerA.name = "Player 1";
        playerB = new Player(Player.REGULAR_PLAYER, game.PLAYER_B_DEFAULT_MARKER);
        playerB.name = "Player 2";       
        
        // set default markers for each player
        playerA.marker = "B";
        playerB.marker = "R";
        
        // select the name of the players of the game
        SelectPlayersView selectPlayersView = new SelectPlayersView(game);
        selectPlayersView.getInput();
        
        return game;
    }
    
    private String quitGame() {
        System.out.println("\n\tAre you sure you want to quit? (Y or N)");
        Scanner inFile = new Scanner(System.in);
        String answer = inFile.next().trim().toUpperCase();
        if (answer.equals("Y")) {
            return Game.EXIT;
        }

        return Game.PLAYING;
    }
    
    public void displayHelpMenu() {
        HelpMenuView helpMenu = new HelpMenuView();
        helpMenu.getInput(null);
    }
    
}