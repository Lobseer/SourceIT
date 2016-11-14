package exept;

/**
 * Created by lobseer on 11.11.2016.
 */
public class CardException extends RuntimeException {
    @Override
    public String getMessage() {
        return "Invalid card manipulate: ";
    }
    public CardException() {
        super();
    }
    public CardException(String message) {
        super(message);
    }
}
