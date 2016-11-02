package Homework6_7Animals;

/**
 * Created by lobseer on 31.10.2016.
 */
public class Bear extends Predator{
    private String color;
    public String getColor() {
        return color;
    }

    public Bear(String name, boolean sex, int age, float speed, float weight, float clawsLength, int toothAmount, String color) {
        super(name, sex, age, speed, weight, false, clawsLength, toothAmount);
        this.color = color;
    }

    public void eat(String food) {
        System.out.println("Eat "+food+"\n");
    }

    @Override
    public void sleep(float hours) {
        if(hours>24){
            System.out.printf("It's winter hibernation"+"\n");
        }else {
            System.out.println("Sleep "+hours+"\n");
        }
    }
}
