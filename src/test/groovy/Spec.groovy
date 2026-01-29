import spock.lang.Specification

class GenericFeatureSpec extends Specification {

    def "should demonstrate a basic Spock test structure"() {
        setup:
        def someValue = 1 + 1

        expect:
        someValue == 2

        and: "another condition can be checked"
        someValue > 0
    }
}