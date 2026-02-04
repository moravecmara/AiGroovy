import org.junit.Test

class GroovyTest2 {

    private static int a = 2
    private static int b = 5

    @Test
    void mathsOp() {
        assert MathUtils.add(a, b) == 7
        assert MathUtils.multiply(a, b) == 10
    }
}