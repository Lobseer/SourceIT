import exept.DeckInvalidSizeExeption;
import exept.DeckIsEmptyException;
import exept.DeckIsFullExeption;
import impl.ICard;
import impl.ICardDeck;

import java.util.*;

/**
 * Created by lobseer on 11.11.2016.
 */
public class Deck implements ICardDeck {
    private ICard[] cards;
    private int maxSize;
    private int total;


    public Deck(int maxSize) throws DeckInvalidSizeExeption {
        if(maxSize>0) {
            this.maxSize = maxSize;
            total=-1;
            cards = new ICard[maxSize];
        }
        else {
            throw new DeckInvalidSizeExeption();//"Deck size can't be less then one"
        }
    }

    @Override
    public void shuffleDeck() {
        Random rnd = new Random();
        ICard[] temp = new Card[maxSize];
        ArrayList<Integer> a = new ArrayList();

        for(int i=0;i<maxSize;i++) {
            a.add(i);
        }
        int irand;
        int gg;
        for(int i=0;i<maxSize;i++) {
            irand=rnd.nextInt(maxSize-i);
            gg=a.get(irand);
            temp[i]=cards[gg];
            a.remove(irand);
        }
        cards=temp;
    }

    @Override
    public ICard pop() throws DeckIsEmptyException{
        if(isEmpty()) throw new DeckIsEmptyException();
        ICard temp = cards[total];
        cards[total] = null;
        total--;
        return temp;
    }

    @Override
    public void push(ICard card) throws DeckIsFullExeption {
        if(++total<maxSize) {
            cards[total]=card;
        }
        else {
            throw new DeckIsFullExeption();
        }
    }

    @Override
    public int total() {
        return total;
    }

    @Override
    public boolean isEmpty() {
        return total==0;
    }

    @Override
    public String toString() {
        return Arrays.toString(cards);
    }
}
