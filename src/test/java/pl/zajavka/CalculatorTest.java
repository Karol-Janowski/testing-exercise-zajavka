package pl.zajavka;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

class CalculatorTest {

    private Calculator calculator;
    Throwable exception =
            Assertions.assertThrows(NumberFormatException.class, () -> Integer.parseInt("MyInput"));

    @BeforeEach
    void beforeEach() {
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Simple calculator addition should work correctly")
    void addTest() {
        //given
        int left = 10;
        int right = 5;
        Integer expected = 15;

        //when
        Integer result = calculator.add(left, right);

        //then
        Assertions.assertEquals(expected, result);
    }

    @Test
    void subtractTest() {
        //given
        int left = 10;
        int right = 5;
        Integer expected = 5;

        //when
        Integer result = calculator.subtract(left, right);

        //then
        Assertions.assertEquals(expected, result);
    }

    @Test
    void multiplyTest() {
        //given
        int left = 5;
        int right = 10;
        Integer expected = 50;

        //when
        Integer result = calculator.multiply(left, right);

        //then
        Assertions.assertEquals(expected, result);
    }

    @Test
    void divideTest() {
        //given
        int left = 10;
        int right = 5;
        Integer expected = 2;

        //when
        Integer result = calculator.divide(left, right);

        //then
        Assertions.assertEquals(expected, result);
    }

    @Test
    void someTest() {
        Assertions.assertEquals(1, 1, createMessage(1));
        Assertions.assertEquals(1, 1, () -> createMessage(2));
        Assertions.assertEquals(1, 2, () -> createMessage(3));
    }

    private String createMessage(int i) {
        System.out.println("Evaluating failure message: " + i);
        return "failure message";
    }

    @Test
    void assertAllTest() {
        Assertions.assertAll(
                () -> Assertions.assertEquals("test1", "test1", createMessage(1)),
                () -> Assertions.assertEquals("test1", "test2", () -> createMessage(2)),
                () -> Assertions.assertEquals("test1", "test4", () -> createMessage(3))
        );
    }

    @Test
    void exceptionTest() {
        Assertions.assertEquals("For input string: \"MyInput\"", exception.getMessage());
    }

    @ParameterizedTest
    @MethodSource(value = "testData")
    void testParametrizedAdding(int[] testData) {
// given
        int left = testData[0];
        int right = testData[1];
        Integer expected = testData[2];
// when
        Integer result = calculator.add(left, right);
// then
        Assertions.assertEquals(expected, result);
    }

    @SuppressWarnings("unused")
    public static int[][] testData() {
        return new int[][]{{1, 1, 2}, {2, 3, 5}, {9, 8, 17}, {2, 19, 21}};
    }


}