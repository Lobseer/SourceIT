package Homework8Racing;

/**
 * Created by lobseer on 02.11.2016.
 */
abstract class Car {
    private String brand;
    private float weight;
    private int wheelsAmount;
    private float drivePower;
    private float nowSpeed;
    private float maxSpeed;
    protected float tankSize;

    public Car(String brand, float weight, int wheelsAmount, float drivePower, float maxSpeed, float tankSize) {
        this.brand = brand;
        this.weight = weight;
        this.wheelsAmount = wheelsAmount;
        this.drivePower = drivePower;
        this.maxSpeed = maxSpeed;
        this.tankSize = tankSize;
    }

    protected void Move() {
        System.out.println("Move with speed= "+nowSpeed+"\n");
    }

}
