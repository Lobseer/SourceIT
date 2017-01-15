package Homework17multithreading;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import static java.lang.Thread.sleep;

/**
 * Class description
 *
 * @author lobseer
 * @version 02.12.2016
 */

public class Shop {

    public synchronized IceCream createIceCream(Child buyer) throws InterruptedException {
        if (buyer == null) throw new NullPointerException("In createIceCream");
        System.out.printf("\n%1s come in, his money: %2s;\n", buyer.getName(), buyer.getMoney());
        IceCream toCreate = buyer.getFavoriteIceCream();
        if (toCreate == null) return null;
        if (buyer.getMoney() >= toCreate.getCost()) {
            sleep(5000);
            buyer.setMoney(buyer.getMoney() - toCreate.getCost());
            System.out.printf("Create icecream for: %1s; money: %2s;\n", buyer.getName(), buyer.getMoney());
            return toCreate.clone();
        } else return null;
    }
}
