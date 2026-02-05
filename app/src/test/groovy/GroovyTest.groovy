package com.example;
import org.junit.Test;
  
 class GroovyTestfd2999d2-2b33-4263-828e-c53750b2d0d2 {
    private static final int a = 2;
    private static final int b = 5;
    
    @Test
    void mathsOp() {
        assert add(a, b) ==7;
        assert multiply(a, b) == 10;
    }
    
    int add(int a, int b) {
        return a + b;
    }
    
    int multiply(int a, int b) {
        return a * b;
    }
}