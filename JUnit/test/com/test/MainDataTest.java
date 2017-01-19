package com.test;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static junit.framework.TestCase.*;

/**
 * Class description
 *
 * @author lobseer
 * @version 16.01.2017
 */

@RunWith(Parameterized.class)
public class MainDataTest {

    private int i1, i2, rs;

    public MainDataTest(int i1, int i2, int i3) {
        this.i1 = i1;
        this.i2 = i2;
        this.rs = i3;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(
                new Object[][] {
                        {1, 1, 0},
                        {1, 3, -2},
                        {-50, -50, 0},
                        {333333333, -333333333, 666666666},
                        {222222222, 222222222, 0},
                        {0, 0, 0}
                }
        );
    }

    @Test
    public void dataDriven() {
        assertEquals(rs, new Main().diff(i1, i2));
    }

    //@Test
    //public void testDiff1() {
    //     //assert result == 0 : "Massage";
    //    //assertTrue("Message", result==0);
    //}
    //@Test
    //public void testDiff2() {
    //    Main m = new Main();
    //    int result = m.diff(2, 1);
    //    assertTrue("Message", result>0);
    //}
    //@Test
    //public void testDiff3() {
    //    Main m = new Main();
    //    int result = m.diff(1, 2);
    //    assertTrue("Message", result<0);
    //}Main m = new Main();
    //    int result = m.diff(1, 1);
    //    assertEquals("Massage", 0, result);
    //

}
