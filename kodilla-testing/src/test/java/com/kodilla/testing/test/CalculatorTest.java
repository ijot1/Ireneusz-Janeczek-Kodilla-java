package com.kodilla.testing.test;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {
    @Test
    public void testAdd() {
        Calculator calculator = new Calculator();
        double result = calculator.add(10, 5);
        assertEquals(15,result,0.001);
    }
}