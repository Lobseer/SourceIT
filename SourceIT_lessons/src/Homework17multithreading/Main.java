package Homework17multithreading;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Class description
 *
 * @author lobseer
 * @version 02.12.2016
 */

public class Main {
    public static void main(String[] args) {
        Shop shop = new Shop();
        List<Child> children = Arrays.asList(
                new Child("Vasya", 32, new IceCream("plombir", "milk", "white", 12.5f), shop ),
                new Child("Petya", 43, new IceCream("chocolate", "cocoa", "brown", 16.9f), shop ),
                new Child("Igor", 25, new IceCream("plombir", "vanilla", "yellow", 13.5f), shop ),
                new Child("Vanya", 64, new IceCream("fruit", "ice", "colorful", 14.9f), shop ),
                new Child("Kiril", 78, new IceCream("melon", "melon", "yellow", 14.5f), shop )
        );
        for(Child ch : children) {
            new Thread(ch, ch.getName()).start();
        }
    }
}
