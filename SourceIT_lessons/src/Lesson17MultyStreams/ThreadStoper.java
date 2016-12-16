package Lesson17MultyStreams;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Class description
 *
 * @author lobseer
 * @version 02.12.2016
 */

public class ThreadStoper implements Runnable {

    ThreadStoper targetToDestroy = null;
    volatile boolean flag = false;

    public ThreadStoper(ThreadStoper targetToDestroy) {
        this.targetToDestroy = targetToDestroy;
    }

    @Override
    public void run() {
        for (int i = 0; i < 1000; i++) {
            safeSleep(1000);
            if (i == 2 && targetToDestroy != null) {
                System.out.println(this
                        + " interrupting " + targetToDestroy);
                targetToDestroy.flag = true;
            }
            if (this.flag) {
                System.out.println("Interrupted "
                        + Thread.currentThread().getName());
                break;
            }
        }
    }

    private void safeSleep(int timeout) {
        try {
            Thread.sleep(timeout);
        } catch (InterruptedException e) {
            System.out.println(Thread.currentThread().getName() +
                    e.getMessage());
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ThreadStoper t1 = new ThreadStoper(null);
        new Thread(new ThreadStoper(t1)).start();
        new Thread(t1).start();
    }
}
