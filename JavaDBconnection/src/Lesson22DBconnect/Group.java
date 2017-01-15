package Lesson22DBconnect;

/**
 * Class description
 *
 * @author lobseer
 * @version 13.01.2017
 */

public class Group {
    public int id;
    public String name;

    public Classroom classroom;

    public Group() {}

    public Group(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("%1s: id =%2s;", name, id);
    }
}
