package Homework15Comparator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.stream.Collectors;

/**
 * Class description
 *
 * @author lobseer
 * @version 26.11.2016
 */

public class Main {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("cnjahsy");
        list.add("opvixxr");
        list.add("sya");
        list.add("syato18sssss");
        list.add("z");
        list.add("aaaaaaaaaaa");
        list.add("z");

        System.out.println(list+"\nDescending sort");
        list.sort(new SortDown());
        System.out.println(list+"\nAscending sort");
        list.sort(new SortUp());
        System.out.println(list+"\nSort by length");
        list.sort(new SortLength());
        System.out.println(list);

        list.stream().map((s)->s.toUpperCase()).peek((s)-> System.out.print(s+", ")).collect(Collectors.toList());
        System.out.println("\n"+list.stream().filter((s)->s=="z").count());
        if(list.stream().anyMatch((s)->s=="sya"))
            System.out.println(list.stream().map((s)-> {
                if(s=="z") return s.toUpperCase();
                else return s;
            }).sorted(new SortUp()).collect(Collectors.toList()));
    }
    static class SortUp implements Comparator {
        @Override
        public int compare(Object o1, Object o2) {
            return ((String)o1).compareToIgnoreCase((String)o2);
        }
    }
    static class SortDown implements Comparator {
        @Override
        public int compare(Object o1, Object o2) {
            return ((String)o2).compareToIgnoreCase((String)o1);
        }
    }
    static class SortLength implements Comparator {
        @Override
        public int compare(Object o1, Object o2) {
            return ((String)o1).length() - ((String)o2).length();
        }
    }
}
