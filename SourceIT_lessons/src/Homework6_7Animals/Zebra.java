package Homework6_7Animals;

/**
 * Created by lobseer on 31.10.2016.
 */
public class Zebra extends Herbivore{
    private int stripesAmount;

    public int getStripesAmount() {
        return stripesAmount;
    }

    public Zebra(String name, boolean sex, int age, float speed, float weight, int stripesAmount) {
        super(name, sex, age, speed, weight, false);
        this.stripesAmount = stripesAmount;
    }
}
