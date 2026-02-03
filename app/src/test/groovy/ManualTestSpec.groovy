package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class MathUtilsTest {

    @Test
    public void testAddition() {
        assertEquals(5, 2 + 3);
    }

    @Test
    public void testSubtraction() {
        assertEquals(2, 5 - 3);
    }

    @Test
    public void testMultiplication() {
        assertEquals(6, 2 * 3);
    }

    @Test
    public void testDivision() {
        assertEquals(2, 6 / 3);
    }
}