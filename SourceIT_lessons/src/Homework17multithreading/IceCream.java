package Homework17multithreading;

/**
 * Class description
 *
 * @author lobseer
 * @version 02.12.2016
 */

public class IceCream implements Cloneable{
    private String name;
    private String taste;
    private String smell;
    private String color;
    private float cost;

    public void setCost(float cost) {
        this.cost = cost;
    }

    public String getName() {
        return name;
    }

    public String getTaste() {
        return taste;
    }

    public String getSmell() {
        return smell;
    }

    public String getColor() {
        return color;
    }

    public float getCost() {
        return cost;
    }

    public IceCream() {
        name = "Default";
        taste = "Default";
        smell = "Default";
        color = "Default";
        cost = 0;
    }

    public IceCream(String taste, String smell, String color, float cost) {
        this.taste = taste;
        this.smell = smell;
        this.color = color;
        this.cost = cost;
    }

    @Override
    public IceCream clone() {
        return new IceCream(taste, smell, color, cost);
    }

    @Override
    public String toString() {
        return "IceCream{" +
                "name='" + name + '\'' +
                ", taste='" + taste + '\'' +
                ", smell='" + smell + '\'' +
                ", color='" + color + '\'' +
                ", cost=" + cost +
                '}';
    }
}
