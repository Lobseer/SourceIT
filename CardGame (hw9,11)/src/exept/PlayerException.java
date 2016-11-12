package exept;

/**
 * Class description
 *
 * @author lobseer
 * @version 12.11.2016
 */

public class PlayerException extends RuntimeException {
    @Override
    public String getMessage() {
        return super.getMessage()+"Invalid card manipulate: ";
    }
    public PlayerException() {
        super();
    }
    public PlayerException(String message) {
        super(message);
    }
}
