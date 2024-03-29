package pl.zajavka;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CalculatorTest {

    private Calculator calculator;
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
        Integer result = calculator.add(left ,right);

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
        Integer result = calculator.subtract(left ,right);

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
        Integer result = calculator.multiply(left ,right);

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
        Integer result = calculator.divide(left ,right);

        //then
        Assertions.assertEquals(expected, result);
    }


}