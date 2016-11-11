package impl;

/**
 * Created by lobseer on 11.11.2016.
 */

public interface IPlayer {
    String getName();
    void addCard(ICard ICard);
    void addCards(ICard[] ICards);
    ICard getCard(int indexInTheHand);
    ICard getRandomCard();
    ICard getRandomCard(ICard.SubType type);
    int acardsAmount();
}
