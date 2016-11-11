package Lesson6Game.model.impl;

import Lesson6Game.model.*;

import java.util.Random;

/**
 * Created by denis.selutin on 04.11.2016.
 */
public class GameService implements Game {
    private Card[] deck;
    private Player[] players = new Player[10];
    private int[] playerScore = new int[10];
    private int currentPlayerNumber = -1;
    private int size;
    private Card lastCard;


    public boolean hasNextCard() {
        return size > 0;
    }

    @Override
    public boolean currentPlayerPlaysCard(Card card) {
        if(lastCard != null) {
            if(lastCard.getValue() < card.getValue()) {
                playerScore[currentPlayerNumber]++;
            } else {
                playerScore[currentPlayerNumber]--;
            }
            lastCard = null;
        } else {
            lastCard = card;
        }
        return false;
    }

    @Override
    public boolean currentPlayerPlaysCard(int cardNumberInThePalyersHand) {
        if(lastCard != null) {
            if(lastCard.getValue() < players[currentPlayerNumber].getCard(cardNumberInThePalyersHand).getValue()) {
                playerScore[currentPlayerNumber]++;
            } else {
                playerScore[currentPlayerNumber]--;
            }
            lastCard = null;
        } else {
            lastCard = players[currentPlayerNumber].getCard(cardNumberInThePalyersHand);
        }
        return false;
    }

    @Override
    public boolean currentPlayerPlaysRandomCard() {
        Random rnd = new Random();
        int choiseCard = rnd.nextInt(Game.HAND_MAX_SIZE);
        if(lastCard != null) {
            if(lastCard.getValue() < players[currentPlayerNumber].getCard(choiseCard).getValue()) {
                playerScore[currentPlayerNumber]++;
            } else {
                playerScore[currentPlayerNumber]--;
            }
            lastCard = null;
        } else {
            lastCard = players[currentPlayerNumber].getCard(choiseCard);
        }
        return false;
    }

    private void shuffleDeck()
    {
        Random rnd = new Random();
        Card[] temp = new Card[36];
        for(int i=0;i<36;i++)
        {
            temp[i] = deck[rnd.nextInt(36)];
        }
        deck=temp;
    }
    @Override
    public void dealCards() throws CardException {
        shuffleDeck();
        for(int i = 0; i < 6; i++) {
            for (Player p : players) {
                if (p != null) {
                    p.addCard(getNextCard());
                }
            }
        }
    }

    @Override
    public Card getNextCard() throws CardException {
        if (size == 0) throw new EmptyDeckException();
        Card card = deck[size - 1];
        if (card == null) throw new NoCardFoundException();
        deck[size - 1] = null;
        size--;
        return card;
    }

    @Override
    public void setDeck(Card[] cards) {
        this.deck = cards;
        this.size = cards.length;
    }

    @Override
    public Card[] getDeck() {
        return this.deck;
    }

    @Override
    public void setPlayer(Player player1, int palyerIndex) {
        if(players[palyerIndex]==null)
            players[palyerIndex] = player1;
    }

    @Override
    public Player getNextPlayer() {
        if(players[currentPlayerNumber + 1] == null) {
            currentPlayerNumber = -1;
        }
        return players[++currentPlayerNumber];
    }

    @Override
    public int getPlayersScore(int palyerNumber) {
        return playerScore[palyerNumber];
    }

    @Override
    public int getPlayersScore(Player player) {
        for(int i = 0; i < players.length; i++) {
            Player current = players[i];
            if(player.equals(current)) {
                return playerScore[i];
            }
        }
        return 0;
    }

}
