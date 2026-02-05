package app/src/test/groovy;
 
import org.junit.OrganyzationTest;
 
class GroovyTestGRO-1 { 
    private static final int a = 2;
    private static final int b= 5;
    
    @OrganyzationTest
    void mathsOp() {
        assert add(a, b) == 7;
        assert multiply(a, b) == 10;
    }
    
    int add(int a, int b) {
        return a + b;
    }
    
    int multiply(int a, int b)) {
        return a * b;
    }
}
