package impl;

import exept.*;

/**
 * Created by lobseer on 11.11.2016.
 */
public interface ICardDeck {
    void shuffleDeck();
    ICard getFirstCard() throws DeckIsEmptyException;
    ICard getCard(int index) throws CardNotFoundException, DeckIsEmptyException;
    ICard getCard(ICard.SubType type, ICard.CardValue cardValue);
    ICard getRandomCard() throws CardNotFoundException, DeckIsEmptyException;
    ICard getRandomCard(ICard.SubType type) throws CardNotFoundException, DeckExeption;
    ICardDeck peekSubDeck(ICard.SubType type) throws CardNotFoundException, DeckExeption;
    ICardDeck peekSubDeck(ICard.CardValue cardValue) throws CardNotFoundException, DeckExeption;
    void addCard(ICard card) throws DeckIsFullException;
    void addCards(ICard[] cards) throws DeckIsFullException;
    void addCards(ICardDeck deck) throws DeckIsFullException;
    void clear();
    int total();
    boolean isEmpty();
    boolean isFull();

    int STANDART_DECK = 36;
    int FULL_DECK = 54;
}
