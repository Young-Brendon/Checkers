package checkers;
/**
 * @author Angela & Brendon
 */
public class Player {
    
    public static final String REGULAR_PLAYER = "REGULAR";
    
    public String name;
    public String marker;
    public String playerType;
    public long wins = 0;
    public long losses = 0; 
    public long ties = 0;
    
    public Player() {
    }

    public Player(String playerType, String marker) {
        this.playerType = playerType;
        this.marker = marker;
    }
    
    
    
    
    private double getWinningPercentage() {
        double totalScore = this.wins + this.losses + ties;
        
        if (totalScore ==  0) {
            return 0;
        }
        
        double winLossRatio = this.wins / totalScore;
        return winLossRatio*100;
    }

    public String getPlayerStastics() {
        String playerStatistics = 
                this.name + " has won "
                + this.getWinningPercentage() + "% of the games."
                + "\n\t" + this.wins + " wins, "
                + this.losses + " losses and "
                + ties + " ties.";
        
        return playerStatistics;
    }

    
}
