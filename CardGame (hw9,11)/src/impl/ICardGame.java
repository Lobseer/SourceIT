package impl;

import exept.*;

/**
 * Created by lobseer on 11.11.2016.
 */
public interface IGame {
    void setDeck(ICard[] ICards);
    ICard[] getDeck() ;
    void setPlayer(IPlayer IPlayer1, int palyerIndex);
    IPlayer getNextPlayer();
    ICard getNextCard() throws CardException;
    boolean currentPlayerPlaysCard(ICard ICard);
    boolean currentPlayerPlaysCard(int cardNumberInThePalyersHand);
    boolean currentPlayerPlaysRandomCard();
    int getPlayersScore(int palyerNumber);
    int getPlayersScore(IPlayer IPlayer);
    void dealCards() throws CardException;
    boolean hasNextCard();

    int DECK_MAX_SIZE = 36;
    int HAND_MAX_SIZE = 6;
}
