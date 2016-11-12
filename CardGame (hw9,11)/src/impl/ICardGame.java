package impl;

import exept.*;

/**
 * Created by lobseer on 11.11.2016.
 */
public interface ICardGame {
    void setDeck(ICardDeck deck);
    ICardDeck getDeck();
    void addPlayer(IPlayer player);
    IPlayer getNextPlayer();
    void takeCards();
    //ICard getNextCard() throws CardException;
    //boolean currentPlayerPlaysCard(ICard ICard);
    //boolean currentPlayerPlaysCard(int cardNumberInThePalyersHand);
    //boolean currentPlayerPlaysRandomCard();
    int getPlayerScore(int palyerNumber);
    //int getPlayerScore(IPlayer IPlayer);
    void dealAllCards() throws CardException;
    //boolean hasNextCard();

    int STANDART_HAND_SIZE = 6;
}
