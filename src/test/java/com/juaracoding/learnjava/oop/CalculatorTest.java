package com.juaracoding.learnjava.oop;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CalculatorTest {

    calculator calculator;

    @BeforeClass 
    public void setUp() {
        calculator = new calculator(); 
        System.out.println("setup sebelum test");
    }

    @BeforeMethod 
    public void beforeMethod() {
        System.out.println("sebelum test method");
    }

    @Test (priority = 1)
    public void testAdd() {
        int result = calculator.add(2, 3);
        Assert.assertEquals(result, 5);
        System.out.println("test add");
    }

    @Test (priority = 2)
    public void testSubtract() {
        int result = calculator.subtract(5, 3);
        Assert.assertEquals(result, 2);
        System.out.println("test subtract");
    }

    @Test (priority = 3)
    public void testMultiply() {
        int result = calculator.multiply(4, 3);
        Assert.assertEquals(result, 12);
        System.out.println("test multiply");
    }

    @Test (priority = 4)
    public void testDivide() {
        double result = calculator.divide(10, 2);
        Assert.assertEquals(result, 5.0);
        System.out.println("test divide");
    }

    @Test(priority = 5, expectedExceptions = IllegalArgumentException.class)
    public void testDivideByZero() {
        calculator.divide(10, 0);
        System.out.println("test divide by zero");
    }

}
