package Lesson6.repelent;

import Lesson6.hierarcy.Fly;
import Lesson6.hierarcy.Insect;

/**
 * Created by denis.selutin on 04.11.2016.
 */
public class RaidFromFlies extends Repelent<Fly> {

    public void kill(Fly insect) {

    }

    public <K extends Insect> void doSmth(K param){
        param.m();
    }

}
