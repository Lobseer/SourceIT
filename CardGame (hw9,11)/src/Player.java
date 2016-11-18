
import impl.ICard;
import impl.IPlayer;

/**
 * Created by lobseer on 12.11.2016.
 */
public class Player implements IPlayer {
    private String name;
    @Override
    public String getName() {
        return name;
    }

    private Deck hand;

    private int totalScore;
    public void addScore(int amount) {
        totalScore+=amount;
    }
    public int getTotalScore() {
        return totalScore;
    }

    public Player(String name, int handSize) {
        this.name = name;
        hand = new Deck(handSize);
        totalScore=0;
    }

    public Deck peekHand() {
        return hand;
    }





    @Override
    public void takeCard(ICard card){
            hand.addCard(card);
    }

    @Override
    public ICard playCard(int indexInTheHand){
        return hand.getCard(indexInTheHand);
    }

    @Override
    public ICard playRandomCard(){
        return hand.getRandomCard();
    }

    @Override
    public ICard playRandomCard(ICard.SubType type){
        return hand.getRandomCard(type);
    }

    @Override
    public int getCardsAmount() {
        return hand.total();
    }

    @Override
    public String toString() {
        return String.format("Player name: %1s;\nHis hand:\n%2s",name,hand);
    }
}
