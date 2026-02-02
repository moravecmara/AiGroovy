```groovy
import groovy.util.GroovyTestCase

class ExampleTest extends GroovyTestCase {

    void testAddition() {
        def result = 2 + 3
        assert result == 5
    }

    void testSubtraction() {
        def result = 5 - 3
        assert result == 2
    }
}
```