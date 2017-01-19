package com.test;

import org.junit.Test;
import org.mockito.Mockito;

import static junit.framework.TestCase.assertTrue;

/**
 * Class description
 *
 * @author lobseer
 * @date 16.01.2017
 */

public class ProxyTest {
    @Test
    public void testDiff() throws Exception {
        Main m = new Main();
        Other mock = Mockito.spy(Other.class);

        Mockito.when(mock.do2()).thenReturn("Our string");
        m.setOther(mock);
        m.diff(1, 1);
        Mockito.verify(mock, Mockito.times(1)).do2();
        assertTrue(true);
    }
}
