
package byui.cit260.checkers.enums;

/**
 *
 * @author Angela
 */
public enum StatusType {
    CONTINUE ("CONTINUE"),
    NEW_GAME ("NEW_GAME"),
    PLAYING ("PLAYING"), 
    WINNER ("WINNER"), 
    QUIT ("QUIT"), 
    ERROR ("ERROR"),
    EXIT ("EXIT");
    
    String value;
    
    StatusType(String value) {
        this.value = value;   
    }
    
    public String getValue() {
        return value;
    }
}  

