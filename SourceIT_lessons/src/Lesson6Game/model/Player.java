package Lesson6Game.model;

/**
 * Created by denis.selutin on 04.11.2016.
 */
public interface Player {
    String getName();
    void addCard(Card card);
    Card getCard(int indexInTheHand);
    Card getRandomCard();
    boolean hasCardsInHand();
}
