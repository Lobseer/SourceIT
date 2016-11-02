package Homework8Racing;

/**
 * Created by lobseer on 02.11.2016.
 */
public class RacingCar extends Car {
    private boolean nitro;

    public RacingCar(String brand, float weight, int wheelsAmount, float drivePower, float maxSpeed, float tankSize, boolean nitro) {
        super(brand, weight, wheelsAmount, drivePower, maxSpeed, tankSize);
        this.nitro = nitro;
    }
}
