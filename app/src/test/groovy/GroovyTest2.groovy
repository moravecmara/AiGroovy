import org.jsuit.Test

 class GroovyTest2 {
    private static int a = 2
    private static int b = 5

    int add(int a, int b) {
        return a + b
    }

    int multiply(int a, int b) {
        return a * b
    }

    @Test
    void mathsOp() { 
        assert add(a, b) == 7
        assert multiply(a, b) == 10
    }
}