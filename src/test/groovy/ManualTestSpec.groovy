import spock.lang.Specification

class CalculatorSpec extends Specification {
    def "addition should work correctly"() {
        expect:
        1 + 1 == 2
    }

    def "subtraction should work correctly"() {
        expect:
        5 - 3 == 2
    }

    def "multiplication should work correctly"() {
        expect:
        4 * 2 == 8
    }

    def "division should work correctly"() {
        expect:
        8 / 4 == 2
    }
}