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
    
    public Player(){
        
    }
    
    public Player(String playerType, String marker) {
        this.playerType = playerType;
        this.marker = marker;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    public String getPlayerType() {
        return playerType;
    }

    public void setPlayerType(String playerType) {
        this.playerType = playerType;
    }
    
    public String getMarker() {
        return marker;
    }

    public void setMarker(String marker) {
        this.marker = marker;
    }    

    public long getWins() {
        return wins;
    }

    public void setWins(long wins) {
        this.wins = wins;
    }

    public long getLosses() {
        return losses;
    }

    public void setLosses(long losses) {
        this.losses = losses;
    }
   
}
