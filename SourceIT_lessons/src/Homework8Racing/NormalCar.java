package Homework8Racing;

/**
 * Created by lobseer on 02.11.2016.
 */
public class NormalCar extends Car{
    private float trunkSize; //багажник
    public float getTrunkSize() {
        return trunkSize;
    }
    public void setTrunkSize(float trunkSize) {
        this.trunkSize = trunkSize;
    }

    private boolean signaling; //сигнализация
    public boolean isSignaling() {
        return signaling;
    }
    public void setSignaling(boolean signaling) {
        this.signaling = signaling;
    }

    public NormalCar(String brand, float weight, int wheelsAmount, float drivePower, float maxSpeed, float tankSize, float trunkSize, boolean signaling) {
        super(brand, weight, wheelsAmount, drivePower, maxSpeed, tankSize);
        this.trunkSize = trunkSize;
        this.signaling = signaling;
    }
}
