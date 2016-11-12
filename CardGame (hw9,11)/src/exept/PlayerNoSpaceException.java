package exept;

/**
 * Created by lobseer on 12.11.2016.
 */
public class PlayerNoSpaceException extends PlayerException {
    @Override
    public String getMessage() {
        return super.getMessage()+" No space in the game!";
    }
    public PlayerNoSpaceException() {
        super();
    }
    public PlayerNoSpaceException(String message) {
        super(message);
    }
}
