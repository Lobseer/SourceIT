package Lesson22DBconnect;

/**
 * Class description
 *
 * @author lobseer
 * @version 14.01.2017
 */

public class Subject {
    public int id;
    public String name;
    public int hours;

    public Subject() {}

    public Subject(int id, String name, int hours) {
        this.id = id;
        this.name = name;
        this.hours = hours;
    }

    @Override
    public String toString() {
        return String.format("%1s: id =%2s; hours =%3s;", name, id, hours);
    }
}
