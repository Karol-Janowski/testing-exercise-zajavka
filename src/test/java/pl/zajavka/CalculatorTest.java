package pl.zajavka;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    @Test
    void addTest() {
        //given
        int left = 5;
        int right = 10;
        Integer expected = 15;

        //when
        Integer result = Calculator.add(left ,right);

        //then
        Assertions.assertEquals(expected, result);
    }
}