def calculator

class Calculator {
    int add(int a, int b) {
        return a + b
    }

    int subtract(int a, int b) {
        return a - b
    }
}

class CalculatorSpec extends spock.lang.Specification {
    
    def setup() {
        calculator = new Calculator()
    }

    def "should add two numbers"() {
        expect:
        calculator.add(a, b) == result

        where:
        a | b || result
        1 | 2 || 3
        5 | 3 || 8
        -1 | 1 || 0
    }

    def "should subtract two numbers"() {
        expect:
        calculator.subtract(a, b) == result

        where:
        a | b || result
        5 | 3 || 2
        3 | 1 || 2
        1 | -1 || 2
    }
}