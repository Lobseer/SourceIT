package Lesson4.compose;

/**
 * Created by Lobseer on 24.10.2016.
 */
public class Skill {
    private String name;
    private boolean hasSkill;

    public Skill(String name, boolean hasSkill) {
        this.name = name;
        this.hasSkill = hasSkill;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isHasSkill() {
        return hasSkill;
    }

    public void setHasSkill(boolean hasSkill) {
        this.hasSkill = hasSkill;
    }
}
