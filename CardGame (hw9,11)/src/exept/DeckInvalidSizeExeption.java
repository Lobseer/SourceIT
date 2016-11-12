package exept;

/**
 * Created by lobseer on 11.11.2016.
 */
public class DeckInvalidSizeExeption extends DeckExeption{
    @Override
    public String getMessage() {
        return super.getMessage()+"Deck size can't be less then one!";
    }
}
