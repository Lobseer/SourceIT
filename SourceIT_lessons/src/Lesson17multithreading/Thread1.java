package Lesson17multithreading;

/**
 * Class description
 *
 * @author lobseer
 * @version 28.11.2016
 */

public class Thread1 implements Runnable {
    private int startFrom;
    private int endWith;

    public static volatile int v;

    public int getStartFrom() {
        return startFrom;
    }

    public void setStartFrom(int startFrom) {
        this.startFrom = startFrom;
    }

    public int getEndWith() {
        return endWith;
    }

    public void setEndWith(int endWith) {
        this.endWith = endWith;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+" start "+v);
        for (int i = startFrom; i < endWith; i++) {
            System.out.println(Thread.currentThread().getName() + " i= "+i);
        }
        System.out.println(Thread.currentThread().getName()+" end "+v++);
    }
}
