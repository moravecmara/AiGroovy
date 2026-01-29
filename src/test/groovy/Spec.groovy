```groovy
import spock.lang.Specification

class AdditionSpec extends Specification {

    def "1 + 1 should equal 2"() {
        expect:
        1 + 1 == 2
    }
}
```