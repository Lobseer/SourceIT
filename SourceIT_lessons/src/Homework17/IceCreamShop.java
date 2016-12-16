package Homework17;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

/**
 * Class description
 *
 * @author lobseer
 * @version 02.12.2016
 */

public class IceCreamShop {
    private List<IceCream> storage = new LinkedList<>();

    private ArrayList<String> tastes = new ArrayList<>();
    private ArrayList<String> smells = new ArrayList<>();
    private ArrayList<String> colors = new ArrayList<>();

    private Random rnd = new Random();

    public void createIceCream() {
        storage.add(new IceCream(
                tastes.get(rnd.nextInt(tastes.size())),
                smells.get(rnd.nextInt(tastes.size())),
                colors.get(rnd.nextInt(tastes.size())),
                rnd.nextFloat()
        ));
    }

    public void createIceCream(IceCream toCreate) {
        if(toCreate == null) createIceCream();
        else {
            storage.add(toCreate);
        }
    }

    public IceCream sellIceCream(IceCream favored) {
        IceCream toSell = storage.stream().filter((p) -> p.getTaste()== favored.getTaste()).findFirst().get();

        return toSell;
    }
}
