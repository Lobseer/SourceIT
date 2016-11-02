package api.exam;

import java.util.List;

/**
 * Created by denis.selutin on 29.07.2016.
 */
public interface Question {
    Them getThem();
    String getName();
    List<String> getPossibleAnswers();
    List<Integer> getCorrectAnswers();
}
