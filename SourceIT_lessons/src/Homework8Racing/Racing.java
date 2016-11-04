package Homework8Racing;

/**
 * Created by lobseer on 04.11.2016.
 */
public interface Racing {
    boolean hasNitro();
    void useNitro();
    boolean race(Racing enemy);
    float getWinFactor();
}
