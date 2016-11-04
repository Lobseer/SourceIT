package Homework8Racing;

/**
 * Created by lobseer on 02.11.2016.
 */
public class TruckForRacing extends Truck {
    public TruckForRacing(String brand, float weight, int wheelsAmount, float drivePower, float maxSpeed, float tankSize, int maxCarsAmount) {
        super(brand, weight, wheelsAmount, drivePower, maxSpeed, tankSize, maxCarsAmount);
    }

    @Override
    public void putCar(Car car) {
        if(car instanceof RacingCar) {
            super.putCar(car);
        } else {
            System.out.println("Put only racing cars!\n");
        }
    }
}
