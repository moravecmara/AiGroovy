import org.junit.jupiter.api.Test

class GroovyTest1 {

    private static int a = 2
    private static int b = 5

    @Test
    void mathsOp() {
        assert add(a, b) == 7
        assert multiply(a, b) == 10
    }

    int add(int a, int b) {
        a + b
    }

    int multiply(int a, int b) {
        a * b
    }
}