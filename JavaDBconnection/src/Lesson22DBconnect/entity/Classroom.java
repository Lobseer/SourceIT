package Lesson22DBconnect.entity;

import Lesson22DBconnect.DataMember;
import Lesson22DBconnect.DataReference;
import Lesson22DBconnect.ForeignKey;

/**
 * Class description
 *
 * @author lobseer
 * @version 13.01.2017
 */

public class Classroom {
    @DataMember
    private int id;

    @DataMember
    private String number;

    @DataMember
    private int capacity;

    @DataMember
    private int school_id;

    @DataMember
    private int subject_id;

    private School school;

    private Subject subject;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getSchool_id() {
        return school_id;
    }

    public void setSchool_id(int school_id) {
        this.school_id = school_id;
    }

    public int getSubject_id() {
        return subject_id;
    }

    public void setSubject_id(int subject_id) {
        this.subject_id = subject_id;
    }

    public School getSchool() {
        return school;
    }

    public void setSchool(School school) {
        this.school = school;
    }

    public Subject getSubject() {
        return subject;
    }

    public void setSubject(Subject subject) {
        this.subject = subject;
    }

    public Classroom() {}

    public Classroom(int id, String number, int capacity) {
        this.id = id;
        this.number = number;
        this.capacity = capacity;
    }

    @Override
    public String toString() {
        return String.format("%1s: id =%2s; capacity = %3s; [School: %4s; Subject: %5s]", number, id, capacity, school==null?"null":school.getName(), subject==null?"null":subject.getName());
    }
}
