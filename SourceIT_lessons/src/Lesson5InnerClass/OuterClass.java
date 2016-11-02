package Lesson5InnerClass;

/**
 * Created by lobseer on 31.10.2016.
 */
public class OuterClass {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    class Inner {
        private String name;
        public void method() {
            name = "holvo";
            OuterClass.this.name="res";
        }
    }
}
