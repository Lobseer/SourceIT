package Homework13ArrayList;

import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedList;
import java.util.Random;

/**
 * Class description
 *
 * @author lobseer
 * @version 21.11.2016
 */

public class Main {
    public static void main(String[] args) {
        int size = 10;
        MyArrayList<Integer> arr = new MyArrayList<>(size);
        Random rnd = new Random();
        for(int i=0; i<size; i++) {
            arr.add(rnd.nextInt(100));
        }
        System.out.println("Size: "+arr.size()+"\nLength: "+arr.length()+"\nArray:"+arr);

        LinkedList<Integer> list = new LinkedList<>();
        list.add(-1);
        list.add(-2);
        list.add(-3);
        list.add(-4);
        list.add(-5);

        arr.addAll(list);
        System.out.println("Array:"+arr);
        System.out.println(arr.agvValue((o1, o2) -> o1-o2));
        System.out.println("Array:"+arr);
    }
}
