package com.juaracoding.learnjava.oop;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import org.testng.Assert;

public class AuthTest {

    Auth auth;

    @BeforeClass 
    public void setUp() {
        auth = new Auth();
        System.out.println("setup sebelum test");
    }

    @DataProvider 
    public Object[][] loginData() {
        return new Object[][] {
            {"admin", "admin123", true},
            {"user", "wrongpassword", false},
            {"admin", "", false},
            {"", "admin123", false}
        };
    }

    @Test (dataProvider = "loginData")
    public void testLogin(String username, String password, boolean expected) {
        boolean result = auth.login(username, password);
        Assert.assertEquals(result, expected);
        System.out.println("test login: " + username + ", " + password);
    }

    @Test
    public void testregister() {
        boolean result = auth.register("1234567890123456", "newuser", "password");
        Assert.assertTrue(result);
        System.out.println("test register");
    }

    @Test 
    public void testLogout() {
        boolean result = auth.logout();
        Assert.assertTrue(result);
        System.out.println("test logout");
    }

}
