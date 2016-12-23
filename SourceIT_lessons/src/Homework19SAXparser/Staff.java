package Homework19SAXparser;

import java.io.Serializable;

/**
 * Class description
 *
 * @author lobseer
 * @version 16.12.2016
 */

public class Staff implements Serializable {
    private int id;
    private String firstName;
    private String lastName;
    private String nikName;
    private double salary;
    private boolean isRegularSalary;


    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getNikName() {
        return nikName;
    }

    public void setNikName(String nikName) {
        this.nikName = nikName;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public boolean isRegularSalary() {
        return isRegularSalary;
    }

    public void setRegularSalary(boolean regularSalary) {
        isRegularSalary = regularSalary;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Staff{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", nikName='" + nikName + '\'' +
                ", salary=" + salary +
                ", isRegularSalary=" + isRegularSalary +
                '}';
    }
}
