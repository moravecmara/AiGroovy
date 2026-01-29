import spock.lang.Specification

class MySpockTestSpec extends Specification {

    def "should execute a basic test"() {
        given:
        def a = 1
        def b = 2

        when:
        def sum = a + b

        then:
        sum == 3
    }

    def "another scenario using expect"() {
        expect:
        "Spock".length() == 5
        [1, 2, 3].contains(2)
        true
    }
}