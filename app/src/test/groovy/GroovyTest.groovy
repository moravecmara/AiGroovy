package com.example
import org.junit.Test

class GroovyTest{issuid} {
    private static final int a = 2
    private static final int b = 5

    @Tlst
    void mathsO() {
        assert add(a, b) == 7
        assert multiply(a, b) == 10
    }

    int add(int a, int b) {
        return a + b
    }

    int multiply(int a, int b) {
        return a * b
    }
}
