import exept.*;
import impl.ICard;
import impl.ICardDeck;
import impl.ICardGame;
import impl.IPlayer;
import sun.management.counter.perf.PerfLongArrayCounter;

/**
 * Class description
 * @author lobseer
 * @version 12.11.2016
 */
public class GameDeberc implements ICardGame{

    private Deck mainDeck;
    @Override
    public void setDeck(ICardDeck deck) {
        mainDeck = (Deck)deck;
    }
    @Override
    public ICardDeck getDeck() {
        return mainDeck;
    }

    private int playersNum;

    private Player[] players;

    private Deck[] playersBanks;
    public Deck getPlayerBank(int index) {
        if(index<0 || index>=playersNum) throw new DeckExeption();
        return playersBanks[index];
    }


    private Deck table;
    public Deck getTable() {
        return table;
    }


    private int currentPlayerNumber;

    private ICard.SubType trump;
    public ICard.SubType getTrump() {
        return trump;
    }

    private Card bottomTrumpCard;
    public Card getBottomTrumpCard() {
        return bottomTrumpCard;
    }

    private enum Combo {
        TERC, FIFTY, DEBERC, BELLA, LAST;
        private boolean isTrump;
        private int high;

        public boolean isTrump() {
            return isTrump;
        }

        public void setTrump(boolean trump) {
            isTrump = trump;
        }

        public int getHigh() {
            return high;
        }

        public void setHigh(int high) {
            this.high = high;
        }
    }

    /**
     * Create game with standard Deberc deck.
     * @param maxPlayers - number of players
     */
    public GameDeberc(int maxPlayers) {
        playersNum=0;
        setDeck(createDebercDeck());
        players = new Player[maxPlayers];
        playersBanks = new Deck[maxPlayers];
        table = new Deck(maxPlayers);
        currentPlayerNumber=-1;
    }

    /**
     * Create game with user's deck.
     * @param maxPlayers - number of players
     * @param deck - user's deck
     */
    public GameDeberc(int maxPlayers, Deck deck) {
        setDeck(deck);
        players = new Player[maxPlayers];
        playersBanks = new Deck[maxPlayers];
        currentPlayerNumber=-1;
    }

    @Override
    public void addPlayer(IPlayer player) {
        if (player == null) throw new NullPointerException("add null player!");
        for(int i=0;i<players.length;i++) {
            if (players[i] == null) {
                players[i]=(Player)player;
                playersBanks[i]=new Deck(mainDeck.total());
                playersNum++;
                return;
            }
        }
        throw new PlayerNoSpaceException();
    }

    /**
     * Use this method before start the game
     */
    void newGame() {
        currentPlayerNumber=-1;
        mainDeck.shuffleDeck();
        bottomTrumpCard=mainDeck.peekLastCard();
        trump=bottomTrumpCard.getSubType();
        dealAllCards();
    }

    Deck createDebercDeck() {
        Deck result = new Deck(32);
        for(Card.SubType type : Card.SubType.values()) {
            for(Card.CardValue val : Card.CardValue.values()) {
                if(val.value>6 && val.value<15) {
                    result.addCard(new Card(type, val));
                }
            }
        }
        return result;
    }

    /**
     * Check chosen player hand for some combination.
     * @param player checked player
     * @return Combo enum if found combination or null otherwise
     */
    Combo comboCheck(Player player) {
        final Deck temp = player.peekHand();
        int serias = 0;
        if(temp.getCard(trump,Card.CardValue.QUEEN)!=null && temp.getCard(trump,Card.CardValue.KING)!=null) {
            return Combo.BELLA;
        }
        for(Card.SubType type : Card.SubType.values()) {
            for(Card.CardValue val : Card.CardValue.values()) {
                if(val.value>6 && val.value<15) {

                }
            }
        }
        return null;
    }

    boolean playCard(Card card) {
        if(table.isFull()) {
            return false;
        } else {
            table.addCard(card);
            return true;
        }
    }

    /**
     * Changed all card on table and put their in winner player's bank
     * @return winner player index
     */
    public int tableCardEquals() {
        int winnerIndex;
        if(table.getSubDeck(trump)==null) {
            winnerIndex = table.getHighestCardIndex(table.peekLastCard().getSubType());
        }
        else {
            winnerIndex = ((Deck)table.getSubDeck(trump)).getHighestCardIndex(trump);
        }
        playersBanks[winnerIndex].addCards(table);
        return winnerIndex;
    }

    public int bankScoreCount(int index) {
        int result=0;
        Card temp;
        while(!playersBanks[index].isEmpty()) {
            temp=(Card)playersBanks[index].getFirstCard();
            switch (temp.getValue()) {
                case SEVEN:
                case EIGHT:
                    break;
                case NINE:
                    if(temp.getSubType()==trump) result+=14;
                    break;
                case TEN:
                    result+=10;
                    break;
                case JACK:
                    if(temp.getSubType()==trump) {
                        result+=20;
                    } else {
                        result+=2;
                    }
                    break;
                case QUEEN:
                    result+=3;
                    break;
                case KING:
                    result+=4;
                    break;
                case ACE:
                    result+=11;
                    break;
                default: throw new CardNotFoundException();
            }
        }
        return result;
    }

    public int whoIsWin() {
        int winnerIndex=currentPlayerNumber=-1;
        int tempScore;
        int maxScore=-1;
        for(int i = 0;i<playersNum;i++) {
            getNextPlayer();
            tempScore=bankScoreCount(currentPlayerNumber);
            if(maxScore<tempScore) {
                maxScore=tempScore;
                winnerIndex=currentPlayerNumber;
            }
        }
        return winnerIndex;
    }

    @Override
    public void takeCards() {
        for(int i=0;i<playersNum;i++) {
            if(!mainDeck.isEmpty()) {
                getNextPlayer().takeCard(mainDeck.getFirstCard());
            }
        }
    }

    @Override
    public void dealAllCards() throws CardException {
        for(int i=0;i<ICardGame.STANDART_HAND_SIZE;i++) {
            takeCards();
        }
    }

    @Override
    public Player getNextPlayer() {
        if(playersNum==0) throw new PlayerDontFoundException();
        for(int i = 0; i<players.length;i++) {
            if ((currentPlayerNumber + 1) == players.length) {
                currentPlayerNumber = -1;
            }
            if (players[currentPlayerNumber + 1] == null) {
                currentPlayerNumber++;
            }
            else return players[++currentPlayerNumber];
        }
        return null;
    }

    @Override
    public int getPlayerScore(int playerNumber) {
        return players[playerNumber].getTotalScore();
    }

    @Override
    public String toString() {
        String result = String.format("Game view:\nDeck:\n %1s\n\n || TrumpCard: %2s\n Players: \n",mainDeck,bottomTrumpCard);
        for(Player p : players) {
            result+= p + "\n";
        }
        result += "End.\n";
        return result;
    }
}
