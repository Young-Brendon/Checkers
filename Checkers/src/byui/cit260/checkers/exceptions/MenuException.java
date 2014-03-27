/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package byui.cit260.checkers.exceptions;

/**
 *
 * @author jacksonrkj
 */
public class MenuException extends Exception {

    public MenuException() {
    }

    public MenuException(String message) {
        super(message);
    }

    public MenuException(String message, Throwable cause) {
        super(message, cause);
    }

    public MenuException(Throwable cause) {
        super(cause);
    }
    
}
