import impl.ICard;

/**
 * Created by lobseer on 11.11.2016.
 */
public class Card implements ICard {
    private SubType subType;
    private int value;


    public Card(SubType subType, int value) {
        this.subType = subType;
        this.value = value;

    }

    @Override
    public Type getType() {
        return value>5?Type.UNCOMMON:Type.COMMON;
    }

    @Override
    public int getValue() {
        return value;
    }

    @Override
    public SubType getSubType() {
        return subType;
    }

    @Override
    public String toString() {
        //"SubType: "+subType+", value: "+value;
        return String.format("SubType: %1s, value: %2s\n",subType,value);
    }
}
