package Homework17multithreading;

import java.util.Random;

import static java.lang.Thread.sleep;

/**
 * Class description
 *
 * @author lobseer
 * @version 02.12.2016
 */

public class Child implements Runnable{
    private String name;
    public String getName() {
        return name;
    }

    private IceCream favoriteIceCream;
    public IceCream getFavoriteIceCream() {
        return favoriteIceCream;
    }
    public void setFavoriteIceCream(IceCream favoriteIceCream) {
        this.favoriteIceCream = favoriteIceCream;
    }

    private IceCream iceCream;
    public IceCream getIceCream() {
        return iceCream;
    }

    private float money;
    public float getMoney() {
        return money;
    }
    public void setMoney(float money) {
        if(money>0) this.money = money;
    }

    private Shop shop;

    public Child() {
        this.name = "Child";
    }

    public Child(String name, float money, IceCream favoriteIceCream, Shop iceCreamShop) {
        this.name = name;
        this.money = money;

        this.favoriteIceCream = favoriteIceCream;

        shop = iceCreamShop;
    }

    public void eatIceCream()
    {
        this.iceCream = null;
        System.out.printf("%1s eat ice cream\n", name);
    }

    @Override
    public void run() {
        try {
            Random rnd = new Random();
            while(money>=favoriteIceCream.getCost()) {
                if(iceCream==null) {
                    iceCream = shop.createIceCream(this);
                    sleep((rnd.nextInt(9)+1)*1000);
                    eatIceCream();
                }
            }
        }
        catch (InterruptedException ex) {
            System.out.println("Exception in child: "+ex.getMessage());
        }
    }
}
