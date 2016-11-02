package Lesson4.compose;

/**
 * Created by Lobseer on 24.10.2016.
 */
public class Main {
    public static void main(String[] args) {
        Developer dev = new Developer("Vasya",300d);
        Skill[] vasyaSkills = new Skill[5];
        vasyaSkills[0]=new Skill("java basic",true);
        vasyaSkills[1]=new Skill("C++ basic",true);
        vasyaSkills[2]=new Skill("sql",true);
        vasyaSkills[3]=new Skill("java servlet",true);
        vasyaSkills[4]=new Skill("C#.NET",true);
        dev.setSkills(vasyaSkills);

        System.out.println(dev.hasSkill("sql"));
        System.out.println(dev.hasSkill("ruby"));

    }
}
