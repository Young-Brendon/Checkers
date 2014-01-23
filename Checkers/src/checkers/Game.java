
package checkers;

/**
 *
 * @author Angela & Brendon
 */
public class Game {
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
       this.playerA.name = "Player 1";
       this.playerB = new Player();
       this.playerB.name = "Player 2";
       
    }


    public void displayWinningMessage () {
        System.out.println(
             "\n\t*******************************************************************************"
             + "\n\t Congratulations " + this.winner.name + "! You won the game."
             + "\n\t Sorry " + this.loser.name + ", You are the loser." 
             + "\n\t*******************************************************************************");
    }

    public void displayTiedMessage () {
       System.out.println( 
               "\n\t*******************************************************************************"
             + "\n\t The game is a tie. Better luck next time!" 
             + "\n\t*******************************************************************************");
    }
    
    public void displayPlayers() {
        System.out.println("\n\tHere are the two default players in the game of TicTacToe.");
        this.playerA.displayName();
        this.playerB.displayName();
                              
    }
}

