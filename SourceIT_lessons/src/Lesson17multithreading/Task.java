package Lesson17multithreading;

/**
 * Class description
 *
 * @author lobseer
 * @version 28.11.2016
 */

public class Task implements Runnable {
    private int a;
    private int b;

    private Storage storege;

    public Task(){}

    public Task(int a, int b, Storage storage) {
        this.a = a;
        this.b = b;
        this.storege = storage;
    }

    @Override
    public void run() {
        for (int i = 0; i < 20; i++) {
            storege.store(Thread.currentThread().getName(), (a+b)/2);
        }


    }
}
