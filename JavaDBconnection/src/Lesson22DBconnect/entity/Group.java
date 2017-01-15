package Lesson22DBconnect.entity;

import Lesson22DBconnect.DataMember;

/**
 * Class description
 *
 * @author lobseer
 * @version 13.01.2017
 */

public class Group {
    @DataMember
    private int id;
    @DataMember
    private String name;
    @DataMember
    private int classroom_id;

    private Classroom classroom;

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

    public int getClassroom_id() {
        return classroom_id;
    }

    public void setClassroom_id(int classroom_id) {
        this.classroom_id = classroom_id;
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }

    public Group() {}

    public Group(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return String.format("%1s: id =%2s; [classroom: %3s]", name, id, classroom==null?"null":classroom.getNumber());
    }
}
