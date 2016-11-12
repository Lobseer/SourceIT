package exept;

/**
 * Created by lobseer on 11.11.2016.
 */
public class DeckIsFullException extends DeckExeption {
    @Override
    public String getMessage() {
        return super.getMessage()+"Deck is full!";
    }
    public DeckIsFullException() {
        super();
    }
    public DeckIsFullException(String message) {
        super(message);
    }
}
