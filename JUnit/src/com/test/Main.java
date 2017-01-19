package com.test;

/**
 * Class description
 *
 * @author lobseer
 * @version 16.01.2017
 */

public class Main {
    String name;

    private Other other;

    public Other getOther() {
        return other;
    }

    public void setOther(Other other) {
        this.other = other;
    }

    public static void main(String[] args) {

    }

    public int diff(int i1, int i2) {
        System.out.println(other.do2());
        int result = i1 - i2;
        return result;
    }
}
