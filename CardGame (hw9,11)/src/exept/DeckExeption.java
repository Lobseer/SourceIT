package exept;

/**
 * Created by lobseer on 11.11.2016.
 */
public class DeckExeption extends RuntimeException {
    @Override
    public String getMessage() {
        return " Invalid deck manipulate: ";
    }
    public DeckExeption() {
        super();
    }
    public DeckExeption(String message) {
        super(message);
    }
}
