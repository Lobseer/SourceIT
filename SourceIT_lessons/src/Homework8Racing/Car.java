package Homework8Racing;

/**
 * Created by lobseer on 02.11.2016.
 */
abstract class Car {
    protected String brand;
    protected float weight;
    protected int wheelsAmount;
    protected float drivePower;
    protected float nowSpeed;
    protected float maxSpeed;
    protected float tankSize;

    public Car(String brand, float weight, int wheelsAmount, float drivePower, float maxSpeed, float tankSize) {
        this.brand = brand;
        this.weight = weight;
        this.wheelsAmount = wheelsAmount;
        this.drivePower = drivePower;
        this.maxSpeed = maxSpeed;
        this.tankSize = tankSize;
    }

    private void setNowSpeed() {
        if (nowSpeed<=maxSpeed){
            nowSpeed+=drivePower-weight/10; //все расчеты сам придумал так как не разбираюсь)
        }
    }

    public void Move() {
        setNowSpeed();
        System.out.println("Move with speed= "+nowSpeed+"\n");
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", weight=" + weight +
                ", wheelsAmount=" + wheelsAmount +
                ", drivePower=" + drivePower +
                ", nowSpeed=" + nowSpeed +
                ", maxSpeed=" + maxSpeed +
                ", tankSize=" + tankSize +
                "}\n";
    }
}
