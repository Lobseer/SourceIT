package Lesson12IOFstreams;

import java.io.Externalizable;
import java.io.Serializable;

/**
 * Class description
 *
 * @author lobseer
 * @version 14.11.2016
 */

public class Vasya implements Serializable{
    public static final long serialVersionUID = 1L;
    private String name;
    private int age;
    private int weight;

    public Vasya(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Vasya{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
