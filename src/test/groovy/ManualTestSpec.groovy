import spock.lang.Specification

class CalculatorSpec extends Specification {

    def "addition of two numbers"() {
        expect:
        add(a, b) == result

        where:
        a | b || result
        1 | 1 || 2
        2 | 3 || 5
        -1 | 1 || 0
        0 | 0 || 0
    }

    int add(int x, int y) {
        return x + y
    }
}