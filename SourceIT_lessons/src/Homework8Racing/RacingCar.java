package Homework8Racing;

import java.util.Random;

/**
 * Created by lobseer on 02.11.2016.
 */
public class RacingCar extends Car implements Racing {
    private boolean nitro;

    @Override
    public boolean hasNitro() {
        return nitro;
    }

    @Override
    public void useNitro() {
        if(nitro){
            nowSpeed*=2;
        }
    }

    @Override
    public float getWinFactor() {
        Random rnd = new Random();
        return  nowSpeed*(80+rnd.nextInt(40))/100f;
    }

    @Override
    public boolean race(Racing enemy) {
        RacingCar car = (RacingCar)enemy;
        System.out.println("Race:\n"+this+"\nvs\n"+enemy+"\n");
        return  this.getWinFactor()>enemy.getWinFactor();
    }

    public RacingCar(String brand, float weight, int wheelsAmount, float drivePower, float maxSpeed, float tankSize, boolean nitro) {
        super(brand, weight, wheelsAmount, drivePower, maxSpeed, tankSize);
        this.nitro = nitro;
    }


    @Override
    public void Move() {
        if(nitro) {
            System.out.println("Move with speed "+nowSpeed+" , you can use NITRO for boost speed\n");
        } else {
            super.Move();
        }
    }
}
