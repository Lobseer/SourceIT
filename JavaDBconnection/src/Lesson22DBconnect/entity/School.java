package Lesson22DBconnect.entity;

import Lesson22DBconnect.DataMember;

/**
 * Class description
 *
 * @author lobseer
 * @version 13.01.2017
 */

public class School {
    @DataMember
    private int id;
    @DataMember
    private String name;
    @DataMember
    private String number;
    @DataMember
    private String addres;

    public School() {}

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

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getAddres() {
        return addres;
    }

    public void setAddres(String addres) {
        this.addres = addres;
    }

    public School(int id, String name, String number, String addres) {
        this.id = id;
        this.name = name;
        this.number = number;
        this.addres = addres;
    }

    @Override
    public String toString() {
        return String.format("%1s: id =%2s; number = %3s; address = %4s;", name, id, number, addres);
    }
}
