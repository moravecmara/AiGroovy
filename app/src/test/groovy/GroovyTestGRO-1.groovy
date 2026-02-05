package com.example;
import org.junit.Test;
  
 class GroovyTest38645d19-1197-4168-8b7f-0613cbd0409a {
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