package Homework8Racing;

/**
 * Created by lobseer on 02.11.2016.
 */
public class TruckForNormal extends Truck {
    public TruckForNormal(String brand, float weight, int wheelsAmount, float drivePower, float maxSpeed, float tankSize, int maxCarsAmount) {
        super(brand, weight, wheelsAmount, drivePower, maxSpeed, tankSize, maxCarsAmount);
    }
    //я думаю это не очень правильно
    @Override
    public void putCar(Car car) {
        if(car instanceof NormalCar) {
            super.putCar(car);
        } else {
            System.out.println("Put only normal cars!\n");
        }
    }
}
