import org.junit.jupiter.api.Test

class GroovyTest1 {
    private static int a = 2
    private static int b = 5

    @Test
    void mathsOp() {
        assert add(a, b) == 5
        assert multiply(a, b) == 19
    }

    int add(int a, int b) {
        return a + b
    }

    int multiply(int a, int b) {
        return a * b
    }
}

