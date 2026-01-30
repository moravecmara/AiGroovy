import spock.lang.Specification

class CalculatorSpec extends Specification {

    def "test addition"() {
        expect:
        add(1, 1) == 2
    }

    def "test subtraction"() {
        expect:
        subtract(5, 3) == 2
    }

    def "test multiplication"() {
        expect:
        multiply(3, 4) == 12
    }

    def "test division"() {
        expect:
        divide(10, 2) == 5
    }

    int add(int a, int b) {
        return a + b
    }

    int subtract(int a, int b) {
        return a - b
    }

    int multiply(int a, int b) {
        return a * b
    }

    int divide(int a, int b) {
        return a / b
    }
}