
package byui.cit260.checkers.controls;

import byui.cit260.checkers.frames.MainFrame;
import byui.cit260.checkers.enums.ErrorType;
import byui.cit260.checkers.models.Player;

/**
 * * @author Angela and Brendon
 */
public class Checkers {
    
    public static MainFrame mainFrame = null;     
      
    private Player[] players = new Player[10];   

    public Checkers(){
        
    }
   
    public Player[] getPlayers() {
        return players;
    }
    
    public void setPlayers(Player[] players) {
        this.players = players;
    }
    
    public static void main(String[] args) {
        
        Checkers checkers = null;       
        
        try {
            checkers = new Checkers();
            java.awt.EventQueue.invokeLater(new Runnable() {
            
                public void run() {
                    Checkers.mainFrame = new MainFrame();
                    Checkers.mainFrame.setVisible(true);
                }
            });
        } catch (Throwable ex) {
            ErrorType.displayErrorMsg("Unexpected error: " + ex.getMessage());
            ErrorType.displayErrorMsg(ex.getStackTrace().toString());
        }
        finally {
            if (Checkers.mainFrame != null) {
                Checkers.mainFrame.dispose();
            }
        }  
    }    
}
