import exept.CardInvalidValueException;
import impl.ICard;

/**
 * Created by lobseer on 11.11.2016.
 */
public class Card implements ICard {
    private SubType subType;
    private CardValue cardValue;


    public Card(SubType subType, CardValue cardValue) {
        if(cardValue.value<0) throw new CardInvalidValueException();
        this.subType = subType;
        this.cardValue = cardValue;
        CardValue c = CardValue.ACE;
    }

    @Override
    public CardValue getValue() {
        return cardValue;
    }

    @Override
    public SubType getSubType() {
        return subType;
    }

    @Override
    public String toString() {
        //"SubType: "+subType+", value: "+value;
        return String.format("SubType: %1s, value: %2s\n",subType,cardValue);
    }
}
