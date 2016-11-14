import exept.*;
import impl.ICard;
import impl.ICardDeck;

import java.util.*;

/**
 * Created by lobseer on 11.11.2016.
 */
public class Deck implements ICardDeck {
    private ICard[] cards;
    private int maxSize;
    private int topCardIndex;


    public Deck(int maxSize) {
        if(maxSize<0) throw new DeckInvalidSizeExeption();//"Deck size can't be less then one"

        this.maxSize = maxSize;
        topCardIndex =-1;
        cards = new ICard[maxSize];
    }

    public ICard cardSwap(int index, ICard card) {
        if(index<0 || index>topCardIndex || cards[index]==null) throw new CardNotFoundException();
        if(card==null) throw new NullPointerException();
        ICard returnCard = cards[index];
        cards[index]=card;
        return returnCard;
    }



    @Override
    public void shuffleDeck() {
        Random rnd = new Random();
        ICard[] temp = new Card[maxSize];
        ArrayList<Integer> nums = new ArrayList();

        for(int i=0;i<maxSize;i++) nums.add(i);

        int irand;
        for(int i=0;i<maxSize;i++) {
            irand=rnd.nextInt(maxSize-i);
            temp[i]=cards[nums.get(irand)];
            nums.remove(irand);
        }
        cards=temp;
    }

    @Override
    public ICard getFirstCard() {
        if(isEmpty()) throw new DeckIsEmptyException();
        ICard temp = cards[topCardIndex];
        cards[topCardIndex] = null;
        topCardIndex--;
        return temp;
    }

    public Card peekLastCard() {
        if(isEmpty()) throw new DeckIsEmptyException();
        return (Card)cards[0];
    }

    @Override
    public ICard getCard(int index){
        if(isEmpty()) throw new DeckIsEmptyException();
        if(index<0 || index>topCardIndex || cards[index]==null) throw new CardNotFoundException();
        ICard cardToReturn = cards[index];
        cards[index] = cards[topCardIndex];
        cards[topCardIndex] = null;
        topCardIndex--;
        return cardToReturn;
    }

    @Override
    public ICard getCard(ICard.SubType type, ICard.CardValue cardValue) {
        if(isEmpty()) throw new DeckIsEmptyException();
        ICard cardToReturn;
        for (int i=0;i<topCardIndex;i++) {
            if (cards[i].getSubType() == type && cards[i].getValue() == cardValue) {
                cardToReturn = cards[i];
                cards[i] = cards[topCardIndex];
                cards[topCardIndex] = null;
                topCardIndex--;
                return cardToReturn;
            }
        }
        return null;
    }

    public int getHighestCardIndex(ICard.SubType type) {
        if(isEmpty()) throw new DeckIsEmptyException();
        int highCard = -1;
        int result=-1;
        for (int i=0;i<topCardIndex;i++) {
            if(cards[i].getSubType()==type) {
                if (highCard < cards[i].getValue().value) {
                    highCard = cards[i].getValue().value;
                    result = i;
                }
            }
        }
        return result;
    }

    @Override
    public ICard getRandomCard() {
        Random rnd = new Random();
        int temp = rnd.nextInt(topCardIndex+1);
        ICard card = getCard(temp);
        return card;
        //return getCard((new Random()).nextInt(topCardIndex+1));
    }

    @Override
    public ICard getRandomCard(ICard.SubType type) {
        Deck deck = (Deck) peekSubDeck(type);
        if(deck==null) return null;
        ICard temp = deck.getRandomCard();
        return getCard(temp.getSubType(),temp.getValue());
    }

    @Override
    public ICardDeck peekSubDeck(ICard.SubType type)  {
        if(isEmpty()) throw new DeckIsEmptyException();
        Deck returnDeck = new Deck(maxSize);
        for (ICard card : cards) {
            if(card.getSubType()==type) returnDeck.addCard(card);
        }
        if(returnDeck.topCardIndex<0) return null;
        return returnDeck;
    }

    @Override
    public ICardDeck peekSubDeck(ICard.CardValue cardValue)  {
        if(isEmpty()) throw new DeckIsEmptyException();
        Deck returnDeck = new Deck(topCardIndex);
        for (ICard card : cards) {
            if(card.getValue()==cardValue) returnDeck.addCard(card);
        }
        if(returnDeck.topCardIndex<0) return null;
        return returnDeck;
    }

    public void insertCard(int index, ICard card) {
        if(index<0 || index>=maxSize) throw new IndexOutOfBoundsException();
        if(card==null) throw new NullPointerException();
        cards[index]=card;
        topCardIndex++;
    }

    @Override
    public void addCard(ICard card) {
        if(isFull()) throw new DeckIsFullException(" In Card add! ");
        cards[++topCardIndex]=card;
    }
    @Override
    public void addCards(ICard[] cards) {
        for(ICard card : cards) {
            if (isFull()) throw new DeckIsFullException(" In Cards add! ");
            this.cards[++topCardIndex] = card;
        }
    }
    @Override
    public void addCards(ICardDeck deck) {
        while (!deck.isEmpty()){
            if (isFull()) throw new DeckIsFullException(" In Cards add! ");
            this.cards[++topCardIndex] = deck.getFirstCard();
        }
    }

    @Override
    public void clear() {
        while(!isEmpty()) {
            getFirstCard();
        }
    }

    @Override
    public int total() {
        return topCardIndex +1;
    }

    @Override
    public boolean isEmpty() {
        return topCardIndex < 0;
    }

    @Override
    public boolean isFull() { return topCardIndex+1 == maxSize;}

    @Override
    public String toString() {
        return Arrays.toString(cards);
    }
}
