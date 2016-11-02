package classes.exam;


import api.exam.Question;

import java.util.List;

/**
 * Created by Lobseer on 22.10.2016.
 */

public class Quest implements Question {
    private String name;
    private QuestThem them;
    private String question;
    List<String> possibleAnswers;
    List<Integer> correctAnswers;



    public Quest(String name, QuestThem them, String question) {
        this.name=name;
        this.question=question;
        this.them = new QuestThem(them.getName(),them.getDescription());
    }

    @Override
    public QuestThem getThem() {
        return them;
    }

    @Override
    public String getName() {
        return name;
    }

    @Override
    public List<String> getPossibleAnswers() {
        return possibleAnswers;
    }

    @Override
    public List<Integer> getCorrectAnswers() {
        return correctAnswers;
    }

    @Override
    public String toString() {
        return "Question{" +
                "name='" + name + '\'' +
                ", them=" + them +
                ", question='" + question + '\'' +
                ", answerVariants=" + possibleAnswers +
                ", correctAnswers=" + correctAnswers +
                '}';
    }
}
