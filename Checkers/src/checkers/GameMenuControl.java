/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package checkers;

/**
 *
 * @author Angela
 */
public class GameMenuControl {
      
    private Game game;    
    
    Board board = new Board();       
    BoardView boardView = new BoardView();  

    
    public GameMenuControl() {
    }    
 
    public void displayBoard() {        
        
        boardView.displayBoard();
    }
    

    public void startNewGame() {
        this.game.start();
        this.displayBoard();
    }
  

     public void displayStatistics() {
        
        Statistics statistics = new Statistics();       
        statistics.displayStatistics();
    }     
 
    public void displayPreferencesMenu() {
        GamePreferencesMenuView gamePreferenceMenuView = new GamePreferencesMenuView();
        gamePreferenceMenuView.getInput();
    }
 
    public void displayHelpMenu() {
        HelpMenuView helpMenuView = new HelpMenuView();
        helpMenuView.getInput();
    }   
    
}
