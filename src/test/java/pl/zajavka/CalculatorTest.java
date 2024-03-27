package pl.zajavka;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    @Test
    void addTest() {
        //given
        int left = 10;
        int right = 5;
        Integer expected = 15;

        //when
        Integer result = Calculator.add(left ,right);

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
        Integer result = Calculator.subtract(left ,right);

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
        Integer result = Calculator.multiply(left ,right);

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
        Integer result = Calculator.divide(left ,right);

        //then
        Assertions.assertEquals(expected, result);
    }


}