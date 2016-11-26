package Lesson14Collections;

/**
 * Class description
 *
 * @author lobseer
 * @version 18.11.2016
 */

public class Main {
    public static void main(String[] args) {
        //LinkedList<Integer> list = new LinkedList();
        //list.add(12);
        ////////////////////////////////////////////////////////
        //Map<Parent, String> parentStringMap = new HashMap<>();
        //Parent p1 = new Parent();
        //Parent p2 = new Child1();
        //Parent p3 = new Child2();
        //parentStringMap.put(p2, "2");
        //parentStringMap.put(p3, "3");
        //parentStringMap.put(p1, "4");
        /////////////////////////////////////////////////////////
        //LinkedList<String> arr = new LinkedList<>();
        ////TreeMap<> arr = new TreeMap();
        //arr.add("stRing3");
        //arr.add("string1");
        //arr.add("sTring2");
        //arr.add("sTring1");
        //arr.add("String1");
        //System.out.println(arr);
        //Collections.sort(arr, String::compareToIgnoreCase);
        //System.out.println(arr);
        //Set set = new HashSet();

    }



    static class Parent implements Comparable{
        private int id;
        private String name;

        @Override
        public int hashCode() {
            return 8;
        }

        @Override
        public boolean equals(Object obj) {
            return false;
        }

        @Override
        public int compareTo(Object o) {
            return name.compareToIgnoreCase(((Parent)o).name);
            //return name.compareTo(((Parent)o).name);
        }
    }

    static class Child1 extends Parent {
        private int age;
    }

    static class Child2 extends Parent {
        private int force;
    }
}
