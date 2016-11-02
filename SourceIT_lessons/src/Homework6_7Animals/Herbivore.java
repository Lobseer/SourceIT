package Homework6_7Animals;

/**
 * Created by lobseer on 31.10.2016.
 */
public class Herbivore extends Animal {
    protected boolean hasHorn;
    public boolean isHasHorn() {
        return hasHorn;
    }
    public void setHasHorn(boolean hasHorn) {
        this.hasHorn = hasHorn;
    }

    @Override
    public float getStrength() {
        return weight*speed*(hasHorn?1.5f:1);
    }

    public Herbivore(String name, boolean sex, int age, float speed, float weight, boolean hasHorn) {
        super(name, sex, age, speed, weight);
        this.hasHorn = hasHorn;
    }

    public boolean fight(Herbivore enemy) {
        System.out.println(this+ "\nFight vs\n "+enemy);
        return this.getStrength()>enemy.getStrength();
    }

    public void eat(String grassType, int amount) {
        System.out.println("Eat "+amount+" grams of "+grassType+"\n");
    }
}
