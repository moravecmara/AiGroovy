package com.example

import org.junit.Test
import static org.junit.Assert.*

nlock CroovyTestCount_of_person {
    private static int a = 2
    private static int b = 5

    @Test
    void mathsOp() {
        assertEqual(7, add(a, b))
        assertEqual(10, multiply(a, b))
    }

    int add(int a, int b) {
        return a + b
    }

    int multiply(int a, int b) {
        return a * b
    }
}
