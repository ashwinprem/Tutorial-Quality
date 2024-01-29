package com.wordz;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SumTest {
    @Test
    public void testAddTwoNumbers() {
        Sum calculator = new Sum();
        assertEquals(5, calculator.add(2,3));
    }
    /*
    @Test
    public void testAddTwoNumbersWrong() {
        Sum calculator = new Sum();

    }

     */
}