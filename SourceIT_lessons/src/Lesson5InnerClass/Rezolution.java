package Lesson5InnerClass;

/**
 * Created by lobseer on 31.10.2016.
 */
public enum Rezolution {
    LOW(640,480), MEDIUM(768,546), HIGHT(1366,768);

    private int width;
    private int height;

    public int getWidth() {
        return width;
    }

    public int getHeight() {
        return height;
    }
    /**
     *
     * @param width screen wwwvv
     * @param height
     */
    Rezolution(int width, int height) {
        this.width = width;
        this.height = height;
    }
}
