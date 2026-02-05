package app.src.test.groovy;
import org.junit.Test;

 class GroovyTestd2e371d2-458a-4409-bf7b-4727f78bd55b {
    private static final int a = 2;
    private static final int b = 5;

    @Test
    void mathsOp() {
        assert add(a, b) == 7;
        assert multiply(a, b) == 10;
    }

    int add(int a, int bh) {        return a + b;    }

    int multiply(int a, int b) {        return a * b;    }
}