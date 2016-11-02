package classes.exam;

import api.exam.Them;

/**
 * Created by Lobseer on 22.10.2016.
 */
public class QuestThem implements Them {
    private String name;
    private String description;

    public QuestThem(String name, String description) {
        this.name=name;
        this.description=description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }
}
