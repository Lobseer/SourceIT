package Lesson6.repelent;

import Lesson6.hierarcy.Insect;

/**
 * Created by denis.selutin on 04.11.2016.
 */
public abstract class Repelent<T extends Insect> {
    public abstract void kill(T insect);
}
