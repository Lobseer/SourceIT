package Lesson16lyamda;

import java.util.Comparator;

/**
 * Class description
 *
 * @author lobseer
 * @version 25.11.2016
 */

public class Main {
    public static void main(String[] args) {
        //Comparator<String> comparator = (s1, s2) -> {
        //    return s1.length() - s2.length();
        //};
        //(s1, s2) -> s1.length() - s2.length();
        //Comparator<String> comparator = (s1, s2) -> {
        //    System.out.println();
        //    return s1.length() - s2.length();
        //};
        //int compare(T o1, T o2)
        //(T o1, T o2)
        //(String s1, String s1)
        //(s1, s1)

        //int compare(T o1, T o2) {
        //   return s1.length() - s2.length();
        //}
        //---
        //(s1, s1) -> {
        //    System.out.println();
        //    return s1.length() - s2.length();
        // }

        //for(String ss : c) {
        //    if(ss.equalsIgnoreCase("STRING1")) {
        //        System.out.println(ss);
        //    }
        //}
        //Comparator<String> comparator = (s1, s2) -> s1.length() - s2.length();
        //(s1, s2) -> {
        //   System.out.println();
        //   return s1.length() - s2.length();
        //};
        //int compare(T o1, T o2)
        //(T o1, T o2)
        //(String s1, String s1)
        //(s1, s1)

        //int compare(T o1, T o2) {
        //   return s1.length() - s2.length();
        //}
        //---
        //(s1, s1) -> {
        //    System.out.println();
        //    return s1.length() - s2.length();
        // }

        //Predicate<Integer> p = (i) ->  i%2 == 0;

        //BiConsumer<Integer, Double> command = (player, skillId) -> {
        //    System.out.println(player);
        //    System.out.println(skillId);
        //};
        //
        //Command<Integer, Double> com = (player, skillId) -> {
        //    System.out.println(player);
        //    System.out.println(skillId);
        //};
        method(-25, 23.56, (i, j) -> {
            System.out.println(i);
            System.out.println(j);
        });
    }

    static void method(int i, double j, Command action) {
        action.doe(i,j);
    }

    public interface Command<T, E> {
        void doe(T i, E j);
    }
}
