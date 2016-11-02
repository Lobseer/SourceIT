package classes.exam;

import api.exam.Question;

import java.util.List;
import java.util.Map;

/**
 * Created by Lobseer on 22.10.2016.
 */
public class Test implements api.exam.Test {
    private Long number;
    List<Question> questions;


    @Override
    public Long getNumber() {
        return number;
    }

    @Override
    public List<Question> getQuestions() {
        return null;
    }

    @Override
    public Map<String, List<Integer>> getAnswers() {
        return null;
    }
}
