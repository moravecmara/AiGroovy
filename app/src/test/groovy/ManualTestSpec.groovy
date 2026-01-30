def class Calculator {
    int add(int a, int b) {
        return a + b
    }

    int subtract(int a, int b) {
        return a - b
    }
}

import spock.lang.Specification

class CalculatorSpec extends Specification {
    def "test addition"() {
        given: "a calculator"
        def calculator = new Calculator()

        expect: "the sum of two numbers is correct"
        calculator.add(a, b) == expected

        where:
        a | b || expected
        1 | 2 || 3
        5 | 7 || 12
        -1 | -2 || -3
    }

    def "test subtraction"() {
        given: "a calculator"
        def calculator = new Calculator()

        expect: "the difference of two numbers is correct"
        calculator.subtract(a, b) == expected

        where:
        a | b || expected
        5 | 3 || 2
        10 | 7 || 3
        0 | 10 || -10
    }
}