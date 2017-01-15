package Lesson22DBconnect;

/**
 * Class description
 *
 * @author lobseer
 * @version 13.01.2017
 */

public class Classroom {
    public int id;
    public String number;
    public int capacity;

    public School school;
    public Subject subject;

    public Classroom(int id, String number, int capacity) {
        this.id = id;
        this.number = number;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return String.format("%1s: id =%2s; number = %3s; capacity = %4s;", number, id, capacity);
    }
}
