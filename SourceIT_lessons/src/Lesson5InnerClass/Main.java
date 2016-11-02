package Lesson5InnerClass;

/**
 * Created by lobseer on 31.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        OuterClass outerClass = new OuterClass();
        OuterClass.Inner inner1 = outerClass.new Inner();
        OuterClass.Inner inner2 = outerClass.new Inner();
        Car car = new Car();
        car.getDvigatel().getKolichestvoCilindrov();
        Rezolution rez = Rezolution.HIGHT;
        switch (rez) {
            case LOW: break;
            case MEDIUM: break;
            case HIGHT: break;
        }
    }
}
