package Lesson22DBconnect;

/**
 * Class description
 *
 * @author lobseer
 * @version 13.01.2017
 */

public class School {
    public int id;
    public String name;
    public String number;
    public String addres;

    public School() {}

    public School(int id, String name, String number, String addres) {
        this.id = id;
        this.name = name;
        this.number = number;
        this.addres = addres;
    }

    @Override
    public String toString() {
        return String.format("%1s: id =%2s; number = %3s; address = %4s;", name, id, number, addres);
    }
}
