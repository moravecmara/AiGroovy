package com.example;

import org.junit.Test;
import static org.junit.Assert.*;

public class StringUtilsTest {

    @Test
    public void testIsEmptyWithEmptyString() {
        assertTrue(StringUtils.isEmpty(""));
    }

    @Test
    public void testIsEmptyWithNull() {
        assertTrue(StringUtils.isEmpty(null));
    }

    @Test
    public void testIsEmptyWithNonEmptyString() {
        assertFalse(StringUtils.isEmpty("Hello"));
    }
}
If you provide a description or requirements for the class you need, I can generate it for you!