import exept.*;
import impl.ICard;
import impl.ICardDeck;

/**
 * Class description
 * @author lobseer
 * @version 11.11.2016
 */
public class Main {
    public static void main(String[] args) {
        try {
            final int MAX_PLAYER = 2;
            GameDeberc game = new GameDeberc(MAX_PLAYER);
            game.addPlayer(new Player("1.Oleg",GameDeberc.STANDART_HAND_SIZE));
            game.addPlayer(new Player("2.Vasya",GameDeberc.STANDART_HAND_SIZE));
            //game.addPlayer(new Player("3.Grisha",GameDeberc.STANDART_HAND_SIZE));


            int winnerIndex=0;
            int bestScore=0;
            Card playedCard;
            Player currentPlayer;
            for(int round=1;bestScore<301;round++) {
                System.out.println("Round: "+round+"!\n");
                game.newGame();
                System.out.println(game);
                System.out.println("Combo state:\n");

                System.out.println("Play state:\n");
                for(int step = 1; step<(ICardDeck.STANDART_DECK-4)/MAX_PLAYER; step++) {
                    System.out.println("Step "+step+"\n");
                    game.setCurrentPlayerNumber(winnerIndex);
                    currentPlayer = game.getNextPlayer();
                    playedCard = (Card) currentPlayer.playRandomCard();
                    while (game.playCard(game.getCurrentPlayerNumber(), playedCard)) {
                        currentPlayer = game.getNextPlayer();
                        playedCard = (Card) currentPlayer.playRandomCard(playedCard.getSubType());
                        if (playedCard == null) {
                            playedCard = (Card) currentPlayer.playRandomCard(game.getTrump());
                        }
                        if(playedCard == null){
                            playedCard = (Card) currentPlayer.playRandomCard();
                        }
                    }

                    System.out.println("End of the step:\nOn table:\n"+game.getTable()+"\nTrump is:"+game.getTrump());
                    winnerIndex = game.tableCardEquals();
                    System.out.println("Player №" + winnerIndex + " is winner!\nHis bank:\n" + game.getPlayerBank(winnerIndex));
                    if(!game.getDeck().isEmpty()) game.takeCards();
                }

                System.out.println("Score count state:\n");

                for (int i=0;i<MAX_PLAYER;i++) {
                    if(game.getNextPlayer().getTotalScore()>bestScore) {
                        bestScore=game.getNextPlayer().getTotalScore();
                    }
                }
            }

        } catch (RuntimeException ex) {
            System.out.println(ex.getMessage());
        }

    }
}
