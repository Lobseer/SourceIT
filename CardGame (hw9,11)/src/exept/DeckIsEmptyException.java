package exept;

/**
 * Created by lobseer on 11.11.2016.
 */
public class DeckIsEmptyException extends DeckExeption {
    @Override
    public String getMessage() {
        return super.getMessage()+"Deck is empty!";
    }
}
