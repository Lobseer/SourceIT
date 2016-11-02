package Homework6_7Animals;

/**
 * Created by lobseer on 31.10.2016.
 */
public abstract class Animal {
    protected String name;
    public String getName() {
        return name;
    }
    protected boolean sex; //true - male; false - female
    public boolean isSex() {
        return sex;
    }
    protected int age;
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    protected float speed;
    public float getSpeed() {
        return speed;
    }
    public void setSpeed(float speed) {
        this.speed = speed;
    }
    protected float weight;
    public float getWeight() {
        return weight;
    }
    public void setWeight(float weight) {
        this.weight = weight;
    }
    public float getStrength() {
        return weight*speed;
    }

    public Animal(String name, boolean sex, int age, float speed, float weight) {
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.speed = speed;
        this.weight = weight;
    }

    public void sleep(float hours) {
        System.out.println("Sleep "+hours);
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", sex=" + sex +
                ", age=" + age +
                ", speed=" + speed +
                ", weight=" + weight +
                '}'+"\n";
    }
}
