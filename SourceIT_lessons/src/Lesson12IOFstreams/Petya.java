package Lesson12IOFstreams;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

/**
 * Class description
 *
 * @author lobseer
 * @version 14.11.2016
 */

public class Petya implements Externalizable {
    public static final long serialVersionUID = 1L;
    private String name;
    private int age;

    public Petya() {}

    public Petya(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeUTF(this.name);
        out.writeInt(this.age);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        this.name = in.readUTF();
        this.age = in.readInt();
    }

    @Override
    public String toString() {
        return "Petya{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
