package com.example;
import org.junit.Test;
  
 class GroovyTest0fa1f295-5458-4bfe-80dd-a82c5162e449 {
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