import exept.DeckInvalidSizeExeption;
import exept.DeckIsEmptyException;
import exept.DeckIsFullExeption;
import impl.ICard;

/**
 * Created by lobseer on 11.11.2016.
 */
public class Main {
    public static void main(String[] args) {
        try {
            System.out.println("Hello\n");
            Deck deck = new Deck(10);
            for(int i = 0 ;i<10;i++) {
                deck.push(new Card(ICard.SubType.CLUB,i));
            }
            for(int i = 0; i<10;i++) {

            }
            System.out.println(deck);
            deck.shuffleDeck();
            System.out.println(deck);

        }
        catch (DeckInvalidSizeExeption ex) {
            System.out.println("Deck size can't be less then one");
        }
        catch (DeckIsFullExeption ex) {
            System.out.println("Deck is full");
        }
        //catch (DeckIsEmptyException ex) {
        //    System.out.println("Deck is empty");
        //}

    }
}
