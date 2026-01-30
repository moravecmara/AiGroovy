import spock.lang.Specification

class CalculationSpec extends Specification {
    def "test addition"() {
        expect:
        1 + 1 == 2
    }

    def "test subtraction"() {
        expect:
        5 - 3 == 2
    }

    def "test multiplication"() {
        expect:
        4 * 2 == 8
    }

    def "test division"() {
        expect:
        8 / 2 == 4
    }

    def "test complex expression"() {
        expect:
        (1 + 2) * 3 - 4 == 5
    }
}