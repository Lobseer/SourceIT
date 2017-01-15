package Lesson22DBconnect.entity;

/**
 * Class description
 *
 * @author lobseer
 * @version 15.01.2017
 */

public class Connector {
    private int id_1;
    private int id_2;

    public int getId_1() {
        return id_1;
    }

    public void setId_1(int id_1) {
        this.id_1 = id_1;
    }

    public int getId_2() {
        return id_2;
    }

    public void setId_2(int id_2) {
        this.id_2 = id_2;
    }

    Connector() {}

    public Connector(int id_1, int id_2) {
        this.id_1 = id_1;
        this.id_2 = id_2;
    }
}
