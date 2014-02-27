
package checkers;

/**
  * @author Angela
 */
public class Game {
    
    public final static String PLAYER_A_DEFAULT_MARKER = "R";
    public final static String PLAYER_B_DEFAULT_MARKER = "B";
    
    public static final String NO_ACTIVE_GAME = "NO_GAME_STARTED";
    public static final String NEW_GAME = "NEW_GAME";
    public static final String PLAYING = "PLAYING"; 
    public static final String WINNER = "WINNER"; 
    public static final String TIE = "TIE"; 
    public static final String QUIT = "QUIT"; 
    public static final String ERROR = "ERROR";
    public static final String EXIT = "EXIT";
    
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
       
       this.playerA.marker = Game.PLAYER_A_DEFAULT_MARKER;
       this.playerB.marker = Game.PLAYER_B_DEFAULT_MARKER;
    }
    
    public Game(String gameType) {
        this();

        this.board = new Board(8, 8);
        
    }


    public void start() {

        this.setPlayingOrder(playerA, playerB);

        // clear the board
        this.board.clearTheBoard();
        this.status = Game.NEW_GAME;
        this.setPlayingOrder(this.playerA, this.playerB);
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

        long noWins = this.winner.wins;
        noWins++;
        this.winner.wins = noWins;
        long noLosses = this.loser.losses;
        noLosses++;
        this.loser.losses = noLosses;

        this.status = Game.WINNER;
        
    }

    public void recordTie() {
        long player1Ties = this.playerA.ties;
        player1Ties++;
        this.playerA.ties = player1Ties;
        long player2Ties = this.playerB.ties;
        player2Ties++;
        this.playerB.ties = player2Ties;

        this.status = Game.TIE;
       
    }



    public String getWinningMessage () {
        return "\n\t*******************************************************************************"
             + "\n\t Congratulations " + winner.name + "! You won the game."
             + "\n\t Sorry " + loser.name + ", You are the loser." 
             + "\n\t*******************************************************************************";
    }

    public String getTiedMessage () {
       return "\n\t*******************************************************************************"
             + "\n\t The game is a tie. Better luck next time!" 
             + "\n\t*******************************************************************************";
    }
}
