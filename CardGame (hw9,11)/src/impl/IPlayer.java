package impl;

import exept.CardNotFoundException;
import exept.DeckIsEmptyException;
import exept.DeckIsFullException;

/**
 * Created by lobseer on 11.11.2016.
 */

public interface IPlayer {
    String getName();
    void takeCard(ICard card) throws DeckIsFullException;
    ICard playCard(int indexInTheHand) throws CardNotFoundException;
    ICard playRandomCard() throws CardNotFoundException,DeckIsEmptyException;
    ICard playRandomCard(ICard.SubType type) throws CardNotFoundException, DeckIsEmptyException;
    int getCardsAmount();
}
