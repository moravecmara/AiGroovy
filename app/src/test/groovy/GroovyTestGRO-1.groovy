package com.example;
import org.junit.Test;
  
 class GroovyTest367657bd-537c-464f-8ac9-56f612bf738d {
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