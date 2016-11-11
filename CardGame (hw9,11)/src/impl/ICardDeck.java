package impl;

import exept.DeckIsEmptyException;
import exept.DeckIsFullExeption;

/**
 * Created by lobseer on 11.11.2016.
 */
public interface ICardDeck {
    void shuffleDeck();
    ICard pop() throws DeckIsEmptyException;
    void push(ICard card) throws DeckIsFullExeption;
    int total();
    boolean isEmpty();

    int STANDART_DECK = 36;
    int FULL_DECK = 54;
}
