package Homework6_7Animals;

/**
 * Created by lobseer on 31.10.2016.
 */
public class Lion extends Predator {
    private boolean inPride;

    public boolean isInPride() {
        return inPride;
    }

    public void setInPride(boolean inPride) {
        this.inPride = inPride;
    }

    private boolean prideLeader;

    public boolean isPrideLeader() {
        return prideLeader;
    }

    public void setPrideLeader(boolean prideLeader) {
        this.prideLeader = prideLeader;
    }

    public Lion(String name, boolean sex, int age, float speed, float weight, float clawsLength, int toothAmount, boolean inPride) {
        super(name, sex, age, speed, weight, true, clawsLength, toothAmount);
        this.inPride = inPride;
    }
}
