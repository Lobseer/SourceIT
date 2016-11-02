package classes.exam;

/**
 * Created by Lobseer on 22.10.2016.
 */
public class TestResult implements api.exam.TestResult {
    private Long testNumber;
    private Long numberOfCorrectAnswers;
    private Long numberOfInCorrectAnswers;

    @Override
    public Long getTestNumber() {
        return testNumber;
    }

    @Override
    public Long getNumberOfCorrectAnswers() {
        return numberOfCorrectAnswers;
    }

    @Override
    public Long getNumberOfQuestions() { return numberOfInCorrectAnswers+numberOfCorrectAnswers; }

    @Override
    public Long getNumberOfIncorrectAnswers() {
        return numberOfInCorrectAnswers;
    }
}
