package Lesson17MultyStreams;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * Class description
 *
 * @author lobseer
 * @version 28.11.2016
 */

public class Main {
    public static void main(String[] args) throws InterruptedException {
        //Random rnd = new Random();
        //Storage storage = new Storage();
        //for (int i = 0; i < 100000000 ; i++) {
        //    Task task = new Task(rnd.nextInt(500),rnd.nextInt(500), storage);
        //    Thread t = new Thread(task);
        //    t.setName("Task("+i+")");
        //    t.start();
        //}
        //
        ExecutorService pool = Executors.newFixedThreadPool(10);
        for(int i = 0; i<Integer.MAX_VALUE; i++)
            pool.submit(new Task());
        pool.shutdown();
        System.out.println("Main end----------------------------------------------------");


        //System.out.println("State: "+t.getState());
        //for (int i = 0; i < 8; i++) {
        //    System.out.println(Thread.currentThread().getName() + " i= "+i);
        //}
        //Thread.sleep(5000);
        //System.out.println("State: "+t.getState());
    }
}
