package Lesson22DBconnect.entity;

import Lesson22DBconnect.DataMember;

import java.util.ArrayList;

/**
 * Class description
 *
 * @author lobseer
 * @version 14.01.2017
 */

public class Subject {
    @DataMember
    private int id;
    @DataMember
    private String name;
    @DataMember
    private int hours;

    private ArrayList<Student> students = new ArrayList<>();

    public ArrayList<Student> getStudents() {
        return students;
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

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

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
