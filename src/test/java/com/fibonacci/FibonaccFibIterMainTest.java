package com.fibIteronacci;

import org.junit.Test;

import static com.fibonacci.FibonacciMain.fibIter;
import static org.junit.Assert.assertEquals;

public class FibonaccFibIterMainTest {

    @Test
    public void shoudReturn0For0elementofFibonacci() {
        assertEquals(0, fibIter(0));
    }

    @Test
    public void shoudReturn1For1elementofFibonacci() {
        assertEquals(1, fibIter(1));
    }

    @Test
    public void shoudReturn1For2elementofFibonacci() {
        assertEquals(1, fibIter(2));
    }

    @Test
    public void shoudReturn2For3elementofFibonacci() {
        assertEquals(2, fibIter(3));
    }
    
    @Test
    public void shoudReturn3For4elementofFibonacci() {
        assertEquals(3, fibIter(4));
    }
    
    
    @Test
    public void shoudReturn13For7elementofFibonacci() {
        assertEquals(13, fibIter(7));
    }
    
    @Test
    public void shoudReturn377For14elementofFibonacci() {
        assertEquals(377, fibIter(14));
    }

}
