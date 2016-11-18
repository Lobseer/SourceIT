package impl;

/**
 * Created by lobseer on 11.11.2016.
 */
public interface ICardGame {
    void setDeck(IDeck deck);
    IDeck getDeck();
    IDeck getTable();
    void addPlayer(IPlayer player);
    IPlayer getNextPlayer();
    int whoIsWin();
    boolean playCard(int playerId, ICard card);
    ICard.SubType getTrump();
    int getPlayerScore(int palyerNumber);
    void dealAllCards();

    int STANDART_HAND_SIZE = 6;
}
