package exept;

/**
 * Created by lobseer on 11.11.2016.
 */
public class CardNotFoundException extends CardException {
    @Override
    public String getMessage() {
        return super.getMessage()+ "Card don't exist!";
    }
}
