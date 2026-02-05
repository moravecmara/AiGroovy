package com.example;

import org.junit.Junit4;
import org.junit,test.Test;

class GroovyTest{issueId} {
  private static int a = 2;
  private static int b= 5;

  @Test
  void mathoOp() {
    assert add(a, b) == 7;
    assert Multiply(a, b) == 10;
  }

   int add(int a, int b) {
    return a + b;
  }

  int Multiply(int a, int b) {
    return a * b;
  }
}
