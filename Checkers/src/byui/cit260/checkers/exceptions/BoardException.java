
package byui.cit260.checkers.exceptions;

/**
 *
 * @author Angela
 */


public class BoardException extends Exception {

    public BoardException() {
    }

    public BoardException(String message) {
        super(message);
    }

    public BoardException(String message, Throwable cause) {
        super(message, cause);
    }

    public BoardException(Throwable cause) {
        super(cause);
    } 
}
