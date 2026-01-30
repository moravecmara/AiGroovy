class Calculator {
    int add(int a, int b) {
        return a + b
    }

    int subtract(int a, int b) {
        return a - b
    }

    int multiply(int a, int b) {
        return a * b
    }

    double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Division by zero is not allowed")
        }
        return a / b as double
    }
}

import spock.lang.Specification

class CalculatorSpec extends Specification {
    def calculator = new Calculator()

    def "test addition"() {
        expect:
        calculator.add(a, b) == result

        where:
        a | b || result
        1 | 1 || 2
        2 | 3 || 5
        -1 | 1 || 0
    }

    def "test subtraction"() {
        expect:
        calculator.subtract(a, b) == result

        where:
        a | b || result
        5 | 3 || 2
        2 | 2 || 0
        0 | 1 || -1
    }

    def "test multiplication"() {
        expect:
        calculator.multiply(a, b) == result

        where:
        a | b || result
        2 | 3 || 6
        -1 | 5 || -5
        0 | 10 || 0
    }

    def "test division"() {
        expect:
        calculator.divide(a, b) == result

        where:
        a | b || result
        6 | 3 || 2.0
        5 | 2 || 2.5
        -10 | 2 || -5.0

        then:
        calculator.divide(1, 0) >> { throw new IllegalArgumentException("Division by zero is not allowed") }
    }
}