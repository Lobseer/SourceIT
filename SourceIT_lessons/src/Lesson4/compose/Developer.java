package Lesson4.compose;

import java.util.List;

/**
 * Created by Lobseer on 24.10.2016.
 */
public class Developer {
    private String name;
    protected double salary;
    private Skill[] skills;

    public Skill[] getSkills() {
        return skills;
    }

    public void setSkills(Skill[] skills) {
        this.skills = skills;
    }

    public Developer(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    public boolean hasSkill(String name) {
        for (Skill temp : skills) {
            if(temp.getName()==name)
                return temp.isHasSkill();
        }
        return false;
    }

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
}
