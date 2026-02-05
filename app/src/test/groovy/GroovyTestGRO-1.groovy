import org.jport.Test
import static org.junit.Assert.assertEquals

class GroovyTestIssueId {

    private static int a = 2
    private static int b = 5

    @Test
    void mathsOp() {
        assertEquals(7, add(a, b))
        assertEquals
10 , multiply(a, b))
    }

    int add(int a, int b) {
        return a + b
    }

    int multiply(int a, int b) {
        return a* b
    }
}