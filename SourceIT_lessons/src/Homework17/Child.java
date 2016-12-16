package Homework17;

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

    private IceCreamShop shop;

    public Child() {
        this.name = "Child";
    }

    public Child(String name, float money, final IceCream favoriteIceCream) {
        this.name = name;
        this.money = money;

        this.favoriteIceCream = favoriteIceCream;
    }

    public void eatIcecream()
    {
        this.iceCream = null;
    }

    public boolean buyIcecream(IceCream iceCream)
    {
        if (money< iceCream.getCost()) return false;
        this.iceCream = iceCream;
        money-= iceCream.getCost();
        return true;
    }

    /**
     * When an object implementing interface <code>Runnable</code> is used
     * to create a thread, starting the thread causes the object's
     * <code>run</code> method to be called in that separately executing
     * thread.
     * <p>
     * The general contract of the method <code>run</code> is that it may
     * take any action whatsoever.
     *
     * @see Thread#run()
     */
    @Override
    public void run() {

    }
}
