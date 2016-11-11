package Lesson6Game.model;

/**
 * Created by denis.selutin on 04.11.2016.
 */
public interface Game {
    void setDeck(Card[] cards);
    Card[] getDeck() ;
    void setPlayer(Player player1, int palyerIndex);
    Player getNextPlayer();
    Card getNextCard() throws CardException;
    boolean currentPlayerPlaysCard(Card card);
    boolean currentPlayerPlaysCard(int cardNumberInThePalyersHand);
    boolean currentPlayerPlaysRandomCard();
    int getPlayersScore(int palyerNumber);
    int getPlayersScore(Player player);
    void dealCards() throws CardException;
    boolean hasNextCard();

    int DECK_MAX_SIZE = 36;
    int HAND_MAX_SIZE = 6;
}
