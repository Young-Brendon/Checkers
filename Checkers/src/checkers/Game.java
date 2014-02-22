
package checkers;

/**
  * @author Angela
 */
public class Game {    
    static String EXIT;
    static String PLAYING;
    static Object NEW_GAME;
    static String WINNER;
    static String TIE;
    static String NO_ACTIVE_GAME;
    String gameType;
    Player playerA;
    Player playerB;
    Player currentPlayer;
    Player otherPlayer;
    Player winner;
    Player loser;
    String status;
    Board board;
        

    public Game() {
   
       this.playerA = new Player();       
       this.playerB = new Player();       
    }


    public String getWinningMessage () {
        
        return "\n\t*******************************************************************************"
             + "\n\t Congratulations " + this.winner.name + "! You won the game."
             + "\n\t Sorry " + this.loser.name + ", You are the loser." 
             + "\n\t*******************************************************************************";
    }
    
}

