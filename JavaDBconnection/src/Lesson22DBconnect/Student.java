package Lesson22DBconnect;

/**
 * Class description
 *
 * @author lobseer
 * @version 13.01.2017
 */

public class Student {
    public int id;
    public String name;
    public int age;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private Group group;

    public Student() {}

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("%1s: id =%2s; age =%3s;", name, id, age);
    }
}
