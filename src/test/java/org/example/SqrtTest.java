package org.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class SqrtTest {

    @Test
    public void testA() {
        Sqrt sqrt = new Sqrt(0);
        assertEquals(2.5, sqrt.average(2.0, 3.0), 0.0001);
    }

    @Test
    public void testB() {
        Sqrt sqrt = new Sqrt(16.0);
        assertTrue(sqrt.good(4.0, 16.0));
    }

    @Test
    public void testC() {
        Sqrt sqrt = new Sqrt(9.0);
        assertTrue(sqrt.good(3.0, 9.0));
    }

    @Test
    public void testD() {
        Sqrt sqrt = new Sqrt(25.0);
        assertTrue(sqrt.good(5.0, 25.0));
    }

    @Test
    public void testFalseB() {
        Sqrt sqrt = new Sqrt(16.0);
        assertFalse(sqrt.good(4.4, 16.0));
    }

    @Test
    public void testFalseC() {
        Sqrt sqrt = new Sqrt(9.0);
        assertFalse(sqrt.good(3.3, 9.0));
    }

    @Test
    public void testFalseD() {
        Sqrt sqrt = new Sqrt(25.0);
        assertFalse(sqrt.good(5.5, 25.0));
    }

    @Test
    public void testE() {
        Sqrt sqrt = new Sqrt(7.0);
        assertEquals(Math.sqrt(7.0), sqrt.calc(), sqrt.getDelta());
    }

    @Test
    public void testF() {
        Sqrt sqrt = new Sqrt(11.0);
        assertEquals(Math.sqrt(11.0), sqrt.calc(), sqrt.getDelta());
    }

    @Test
    public void testG() {
        Sqrt sqrt = new Sqrt(2.0);
        assertEquals(Math.sqrt(2.0), sqrt.calc(), sqrt.getDelta());
    }

    @Test
    public void testImpr() {
        Sqrt sqrt = new Sqrt(16.0);
        double improved = sqrt.improve(4.0, 16.0);
        assertEquals(4.0, improved, 0.0001);
    }

    @Test
    public void testIterConv() {
        Sqrt sqrt = new Sqrt(16.0);
        double result = sqrt.iter(2.0, 16.0);
        assertEquals(4.0, result, 0.0001);
    }

    @Test
    public void testH() {
        Sqrt sqrt = new Sqrt(11);
        assertEquals(sqrt.calc(), Math.sqrt(11), sqrt.getDelta());
    }

    @Test
    public void testI() {
        Sqrt sqrt = new Sqrt(13);
        assertEquals(sqrt.calc(), Math.sqrt(13), sqrt.getDelta());
    }

    @Test
    public void testZero() {
        Sqrt sqrt = new Sqrt(0.0);
        double result = sqrt.calc();
        assertEquals(0.0, result, 0.0001);
    }

    @Test
    public void testSmall() {
        Sqrt sqrt = new Sqrt(0.25);
        double result = sqrt.calc();
        assertEquals(0.5, result, 0.0001);
    }
    @Test
    public void testSmallA() {
        Sqrt sqrt = new Sqrt(0.36);
        double result = sqrt.calc();
        assertEquals(0.6, result, 0.0001);
    }
}
