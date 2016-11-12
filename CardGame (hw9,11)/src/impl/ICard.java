package impl;

/**
 * Created by lobseer on 11.11.2016.
 */

public interface ICard {

    CardValue getValue();

    SubType getSubType();

    enum CardValue {
        TWO(2), THREE(3), FOUR(4), FIVE(5), SIX(6), SEVEN(7), EIGHT(8), NINE(9), TEN(10),
        JACK(11), QUEEN(12), KING(13), ACE(14), JOCKER(15);
        public int value;

        CardValue(int value) {
            this.value = value;
        }
    }

    enum SubType {
        HEART, DIAMOND, CLUB, SPADE;
    }
}