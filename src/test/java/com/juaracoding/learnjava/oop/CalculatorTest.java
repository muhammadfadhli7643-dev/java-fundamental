package com.juaracoding.learnjava.oop;

import org.testng.annotations.Test;

public class CalculatorTest {

    @Test
    public void testAdd() {
        calculator calc = new calculator();
        int result = calc.add(2, 3);
        assert result == 5 : "Expected 5 but got " + result;
    }

    @Test
    public void testSubtract() {
        calculator calc = new calculator();
        int result = calc.subtract(5, 3);
        assert result == 2 : "Expected 2 but got " + result;
    }

}
