package Homework6_7Animals;

/**
 * Created by lobseer on 31.10.2016.
 */
public class Predator extends Animal {
    protected boolean nightVision;
    public boolean isNightVision() {
        return nightVision;
    }

    protected float clawsLength;
    public float getClawsLength() {
        return clawsLength;
    }
    public void setClawsLength(float clawsLength) {
        this.clawsLength = clawsLength;
    }

    protected int toothAmount;
    public int getToothAmount() {
        return toothAmount;
    }
    public void setToothAmount(int toothAmount) {
        this.toothAmount = toothAmount;
    }

    @Override
    public float getStrength() {
        return (weight*speed+clawsLength*20+toothAmount*2)*(nightVision?1.3f:1f);
    }

    public Predator(String name, boolean sex, int age, float speed, float weight, boolean nightVision, float clawsLength, int toothAmount) {
        super(name, sex, age, speed, weight);
        this.nightVision = nightVision;
        this.clawsLength = clawsLength;
        this.toothAmount = toothAmount;
    }

    public boolean attack(Herbivore animal) {
        System.out.println(this + "\nAttack \n "+animal);
        return this.getStrength()>animal.getStrength();
    }

    public void eat(Herbivore animal) {
        System.out.println("Eat "+ animal.getName()+"\n");
    }
}
