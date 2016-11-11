package impl;

/**
 * Created by lobseer on 11.11.2016.
 */

public interface ICard {

    Type getType();

    int getValue();

    SubType getSubType();

    enum hardValue {
        ONE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN,
        JACK, QUEEN, KING, ACE, JOCKER;
    }

    enum Type {
        COMMON, UNCOMMON, JOKER;
    }

    enum SubType {
        HEART, DIAMOND, CLUB, SPADE;
    }
}
