package com.fibonacci;

import org.junit.Test;

import static com.fibonacci.FibonacciMain.fib;
import static org.junit.Assert.assertEquals;

public class FibonaccFibMainTest {

    @Test
    public void shoudReturn0For0elementofFibonacci() {
        assertEquals(0, fib(0));
    }

    @Test
    public void shoudReturn1For1elementofFibonacci() {
        assertEquals(1, fib(1));
    }

    @Test
    public void shoudReturn1For2elementofFibonacci() {
        assertEquals(1, fib(2));
    }

    @Test
    public void shoudReturn2For3elementofFibonacci() {
        assertEquals(2, fib(3));
    }
    
    @Test
    public void shoudReturn3For4elementofFibonacci() {
        assertEquals(3, fib(4));
    }
    
    
    @Test
    public void shoudReturn13For7elementofFibonacci() {
        assertEquals(13, fib(7));
    }
    
    @Test
    public void shoudReturn377For14elementofFibonacci() {
        assertEquals(377, fib(14));
    }

}
