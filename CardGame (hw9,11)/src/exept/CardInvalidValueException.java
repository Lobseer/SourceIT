package exept;

/**
 * Created by lobseer on 12.11.2016.
 */
public class CardInvalidValueException extends CardException {
    @Override
    public String getMessage() {
        return super.getMessage()+" Card value can't be less then zero";
    }
}
