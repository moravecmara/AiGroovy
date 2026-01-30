@Test
void "test add two numbers"() {
    // setup
    def calculator = new Calculator()

    // when
    def result = calculator.add(2, 3)

    // then
    assert result == 5
} 

@Test
void "test multiply two numbers"() {
    // setup
    def calculator = new Calculator()

    // when
    def result = calculator.multiply(2, 3)

    // then
    assert result == 6
} 

class Calculator {
    def add(int a, int b) {
        return a + b
    }
    def multiply(int a, int b) {
        return a * b
    }
}