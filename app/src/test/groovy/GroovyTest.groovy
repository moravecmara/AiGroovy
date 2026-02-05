package com.example;
import org.junit.Test;
  
 class GroovyTestdd76a442-1cb4-4b20-aed7-cf08ac5f89f0 {
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