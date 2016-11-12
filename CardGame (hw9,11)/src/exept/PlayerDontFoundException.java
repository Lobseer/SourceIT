package exept;

/**
 * Class description
 *
 * @author lobseer
 * @version 12.11.2016
 */

public class PlayerDontFoundException extends PlayerException{
    @Override
    public String getMessage() {
        return super.getMessage()+"Invalid card manipulate: ";
    }
    public PlayerDontFoundException() {
        super();
    }
    public PlayerDontFoundException(String message) {
        super(message);
    }
}
