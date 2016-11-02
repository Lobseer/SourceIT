package Homework6_7Animals;

/**
 * Created by lobseer on 31.10.2016.
 */
public class Predator extends Animal {
    protected boolean nightVision;
    protected float clawsLength;
    protected int toothAmount;

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
        System.out.println("Eat "+ animal.getName());
    }
}
