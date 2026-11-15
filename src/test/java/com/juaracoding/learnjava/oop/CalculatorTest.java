package com.juaracoding.learnjava.oop;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class CalculatorTest {

    calculator calculator;

    @BeforeClass 
    public void setUp() {
        calculator = new calculator(); 
        System.out.println("setup sebelum test");
    }

    @Test
    public void testAdd() {
        int result = calculator.add(2, 3);
        Assert.assertEquals(result, 5);
    }

    @Test
    public void testSubtract() {
        int result = calculator.subtract(5, 3);
        Assert.assertEquals(result, 2);
    }

}
