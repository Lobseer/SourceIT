package classes.exam;

import api.exam.*;
import api.exam.Question;
import api.exam.Test;
import api.exam.Them;

import java.util.List;
import java.util.Map;

/**
 * Created by Lobseer on 22.10.2016.
 */
public class Testing implements Service {


    @Override
    public void addQuestion(Question question) {

    }

    @Override
    public void addThem(Them them) {

    }

    @Override
    public Test createRandomTest() {
        return null;
    }

    @Override
    public TestResult performTest(Test test, Map<String, List<Integer>> answers) {
        return null;
    }
}
