package Lesson22DBconnect.entity;

import Lesson22DBconnect.DataMember;
import Lesson22DBconnect.DataReference;
import Lesson22DBconnect.ForeignKey;

import java.util.ArrayList;

/**
 * Class description
 *
 * @author lobseer
 * @version 13.01.2017
 */

public class Student {
    @DataMember
    private int id;

    @DataMember
    private String name;

    @DataMember
    private int age;

    @DataMember
    private int group_id;

    private Group group;

    private ArrayList<Subject> subjects = new ArrayList<>();

    public ArrayList<Subject> getSubjects() {
        return subjects;
    }

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

    public int getGroup_id() {
        return group_id;
    }

    public void setGroup_id(int group_id) {
        this.group_id = group_id;
    }

    public Group getGroup() {
        return group;
    }

    public void setGroup(Group group) {
        this.group = group;
    }

    public Student() {}

    public Student(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return String.format("%1s: id = %2s; age = %3s; [group: %4s]", name, id, age, group==null?"null":group.getName());
    }
}
