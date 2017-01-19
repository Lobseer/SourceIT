package com.test;

import org.junit.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Class description
 *
 * @author lobseer
 * @date 16.01.2017
 */

public class MainTest {

    @Test(expected = IndexOutOfBoundsException.class)
    public void testEx() {
        List t = new ArrayList<>();
        t.remove(0);
    }

    @Test(timeout = 1000)
    public void testTime() {
        try {
            Thread.sleep(900);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Before
    public void before() {
        System.out.println("Before");
    }

    @After
    public void after() {
        System.out.println("After");
    }

    @AfterClass
    public static void afterClass() {
        System.out.println("AfterClass");
    }

    @BeforeClass
    public static void beforeClass() {
        System.out.println("BeforeClass");
    }

}
