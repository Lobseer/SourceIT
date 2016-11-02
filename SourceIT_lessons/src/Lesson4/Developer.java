package Lesson4;

/**
 * Created by Lobseer on 24.10.2016.
 */
public class Developer {
    private String name;
    protected double salary;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }


    @Override
    public String toString() {
        return "Developer name: "+name;
    }
}
