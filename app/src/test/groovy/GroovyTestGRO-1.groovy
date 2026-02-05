class GroovyTest{issueID} {
    private static final int a = 2;
    private static final int b = 5;

    @test
    void mathsOp() {
        assert add(a, b) == 7;
        assert multiply(a, b) == 10;
    }

    int add(int a, int b) {
        return a + b;
    }

    int multiply(int a, int b) {
        return a * b;
    }
}
