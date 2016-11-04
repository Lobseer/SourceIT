package Homework8Racing;

import java.util.Random;

/**
 * Created by lobseer on 04.11.2016.
 */
public class Paver extends Car implements Flying,Racing {
    public Paver(String brand, float weight, int wheelsAmount, float drivePower, float maxSpeed, float tankSize) {
        super(brand, weight, wheelsAmount, drivePower, maxSpeed, tankSize);
    }

    @Override
    public boolean isCanFly() {
        return true;
    }

    @Override
    public boolean hasNitro() {
        return false;
    }

    @Override
    public void fly() {
        System.out.println("I believe I can fly \n");
        maxSpeed*=2;
    }

    @Override
    public void useNitro() {
        System.out.println("Paver don't has NITRO!");
    }

    @Override
    public boolean race(Racing enemy) {
        return false;
    }

    @Override
    public float getWinFactor() {
        Random rnd = new Random();
        return  nowSpeed*((80f+rnd.nextInt(40))/100f+(isCanFly()?50f:0));
    }
}
