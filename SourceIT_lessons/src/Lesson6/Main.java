package Lesson6;

import Lesson6.hierarcy.Cockroach;
import Lesson6.hierarcy.Fly;
import Lesson6.hierarcy.Insect;
import Lesson6.repelent.RaidFromFlies;
import Lesson6.repelent.Repelent;

/**
 * Created by denis.selutin on 04.11.2016.
 */
public class Main {
    public static void main(String[] args) {
        /*
        класс
        <modificator> class ClassName [<T [extends/implements ClassName1]>]
        метод
        <modificator> [<T>] <return type> methodName([prams])
         */

        Repelent<Fly> repelent = new RaidFromFlies();

        RaidFromFlies repelent2 = new RaidFromFlies();

        Cockroach c = new Cockroach();
        Fly f = new Fly();
        Insect i = new Insect();

        repelent2.<Cockroach>doSmth(c);
        repelent2.<Fly>doSmth(f);
        repelent2.<Insect>doSmth(f);
        repelent2.<Insect>doSmth(c);
        repelent2.<Insect>doSmth(i);
    }
}














