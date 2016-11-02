package api.exam;

import java.util.List;
import java.util.Map;

/**
 * Created by denis.selutin on 29.07.2016.
 */
public interface Service {
    void addQuestion(Question question);
    void addThem(Them them);
    Test createRandomTest();
    TestResult performTest(Test test, Map<String, List<Integer>> answers);
}
