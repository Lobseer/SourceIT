package Homework6_7Animals;

/**
 * Created by lobseer on 02.11.2016.
 */
public class Elephant extends Herbivore {
    private int hornAmount=2;

    public int getHornAmount() {
        return hornAmount;
    }

    public void setHornAmount(int hornAmount) {
        this.hornAmount = hornAmount;
    }

    private float hornLength;

    public float getHornLength() {
        return hornLength;
    }

    public void setHornLength(float hornLength) {
        this.hornLength = hornLength;
    }
    private float snoutLength; // хобот

    public float getSnoutLength() {
        return snoutLength;
    }

    public void setSnoutLength(float snoutLength) {
        this.snoutLength = snoutLength;
    }

    public Elephant(String name, boolean sex, int age, float speed, float weight, float hornLength, float snoutLength) {
        super(name, sex, age, speed, weight, true);
        this.hornLength = hornLength;
        this.snoutLength = snoutLength;
    }

    @Override
    public float getStrength() {
        return weight*speed*1.5f + hornAmount*hornLength+snoutLength;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", speed=" + speed +
                ", weight=" + weight +
                ", hornAmount=" + hornAmount +
                ", hornLength=" + hornLength +
                ", snoutLength=" + snoutLength +
                '}'+"\n";
    }
}
