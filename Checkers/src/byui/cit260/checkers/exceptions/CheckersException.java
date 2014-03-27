
package byui.cit260.checkers.exceptions;

/**
 *
 * @author Angela
 */
public class CheckersException extends Exception {

    public CheckersException() {
    }

    public CheckersException(String message) {
        super(message);
    }

    public CheckersException(String message, Throwable cause) {
        super(message, cause);
    }

    public CheckersException(Throwable cause) {
        super(cause);
    }
    
}
