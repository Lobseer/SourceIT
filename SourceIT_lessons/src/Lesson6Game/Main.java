package Lesson6Game;

import Lesson6Game.model.Card;
import Lesson6Game.model.Game;
import Lesson6Game.model.Player;

public class Main {

    public static void main(String[] args) {
	    Card[] allCards = new Card[36];
        int index = 0;
        for(Card.SubType subType : Card.SubType.values()) {
            for (int i = 6; i < 11; i++) {
                allCards[index++] = newCard(Card.Type.COMMON, i, subType);
            }
            //jack
            allCards[index++] = newCard(Card.Type.UNCOMMON, 2, subType);
            //queen
            allCards[index++] = newCard(Card.Type.UNCOMMON, 3, subType);
            //king
            allCards[index++] = newCard(Card.Type.UNCOMMON, 4, subType);
            //ace
            allCards[index++] = newCard(Card.Type.UNCOMMON, 11, subType);
        }

        Game game = null;
        Player player1 = null;
        Player player2 = null;

        game.setDeck(allCards);
        game.setPlayer(player1, 0);
        game.setPlayer(player2, 1);

        game.dealCards();

        while(game.getDeck().length > 0) {
            Player currentPlayer = game.getNextPlayer();
            Card card = currentPlayer.getRandomCard();
            System.out.println("Player " + currentPlayer + " is playing card " + card);
            game.currentPlayerPlaysCard(card);
            currentPlayer.addCard(game.getNextCard());
        }

        System.out.println(player1 + " has score " + game.getPlayersScore(player1));
        System.out.println(player2 + " has score " + game.getPlayersScore(player2));
    }

    private static Card newCard(Card.Type type, int value, Card.SubType subType) {
        return new Card() {
            @Override
            public Type getType() {
                return type;
            }

            @Override
            public int getValue() {
                return value;
            }

            @Override
            public SubType getSubType() {
                return subType;
            }
        };
    }
}

