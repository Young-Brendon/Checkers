
package byui.cit260.checkers.models;

import byui.cit260.checkers.enums.GameType;
import byui.cit260.checkers.enums.StatusType;

/**
  * @author Angela
 */
public class Game {
    
    public final static String PLAYER_A_DEFAULT_MARKER = "R";
    public final static String PLAYER_B_DEFAULT_MARKER = "B";
    
          
    private GameType gameType; 
    public Player playerA;
    public Player playerB;
    private Player currentPlayer;
    private Player otherPlayer;
    private Player winner;
    private Player loser;
    private StatusType status;
    private Board board;
           
    public Game() {
   
       this.playerA = new Player();       
       this.playerB = new Player();
       
       this.playerA.setMarker(Game.PLAYER_A_DEFAULT_MARKER);
       this.playerB.setMarker(Game.PLAYER_B_DEFAULT_MARKER);
    }
    
    public Game(GameType gameType) {
        this();

        this.gameType = gameType;
        this.board = new Board(8, 8);
        
    }
    
    public GameType getGameType() {
        return gameType;
    }

    public void setGameType(GameType gameType) {
        this.gameType = gameType;
    }

    public Player getPlayerA() {
        return playerA;
    }

    public void setPlayerA(Player playerA) {
        this.playerA = playerA;
    }

    public Player getPlayerB() {
        return playerB;
    }

    public void setPlayerB(Player playerB) {
        this.playerB = playerB;
    }

    public Player getCurrentPlayer() {
        return currentPlayer;
    }

    public void setCurrentPlayer(Player currentPlayer) {
        this.currentPlayer = currentPlayer;
    }

    public Player getOtherPlayer() {
        return otherPlayer;
    }

    public void setOtherPlayer(Player otherPlayer) {
        this.otherPlayer = otherPlayer;
    }

    public StatusType getStatus() {
        return status;
    }

    public void setStatus(StatusType status) {
        this.status = status;
    }

    public Player getWinner() {
        return winner;
    }

    public void setWinner(Player winner) {
        this.winner = winner;
    }

    public Player getLoser() {
        return loser;
    }

    public void setLoser(Player loser) {
        this.loser = loser;
    }

    public Board getBoard() {
        return board;
    }

    public void setBoard(Board board) {
        this.board = board;
    }

    public void start() {

        this.setPlayingOrder(playerA, playerB);
        this.setStatus(StatusType.NEW_GAME);
        return;
    }

  public void setPlayingOrder(Player player1, Player player2) {

        double randomValue = Math.random();

        if (randomValue < 0.5) {
            this.currentPlayer = player1;
            this.otherPlayer = player2;
        } else {
            this.otherPlayer = player2;
            this.currentPlayer = player1;
        }

    }

    public void recordWinner() {
        if (this.currentPlayer == this.playerA) {
            this.winner = this.playerA;
            this.loser = this.playerB;
        } else {
            this.winner = this.playerB;
            this.loser = this.playerA;
        }

        long noWins = this.winner.getWins();
        noWins++;
        this.winner.setWins(noWins);
        long noLosses = this.loser.getLosses();
        noLosses++;
        this.loser.setLosses(noLosses);

        this.setStatus(StatusType.WINNER);
        
    }




 public String getWinningMessage () {
        return "\n\t*******************************************************************************"
             + "\n\t Congratulations " + winner.getName() + "! You won the game."
             + "\n\t Sorry " + loser.getName() + ", You are the loser."
             + "\n\t*******************************************************************************";
    }
}
