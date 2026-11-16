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

    @DataProvider 
    public Object[][] registerData() {
        return new Object[][] {
            {"1234567890123456", "newuser1", "password123",},
            {"1234567890123457", "newuser2", "password123",}, 
            {"1234567890123458", "newuser3", "password123",}, 
            {"1234567890123459", "newuser4", "password123",}, 
            {"1234567890123450", "newuser5", "password123",}

        };
    }

   @Test(dataProvider = "registerData")
   public void testRegister(String nik, String username, String password) {
           boolean result = auth.register(nik, username, password);
           Assert.assertTrue(result);
           System.out.println("test register sukses di jalankan");    
    }

    @Test (expectedExceptions = IllegalArgumentException.class)
    public void testRegisterWithInvalidNIK() {
        auth.register("invalidNIK", "newuser", "password123");
        System.out.println("test register dengan NIK tidak valid dijalankan");
    }

    @DataProvider (name = "invalidRegisterData")
    public Object[][] invalidRegisterData() {
        return new Object[][] {
            {"", "newuser", "password123"}, // NIK kosong
            {"1234567890123456", "", "password123"}, // Username kosong
            {"1234567890123456", "newuser", ""}, // Password kosong
            {"1234567890123456", "newuser", "pass"} // Password kurang dari 8 karakter
        };
    }

    @Test (dataProvider = "invalidRegisterData", expectedExceptions = IllegalArgumentException.class)
    public void testRegisterWithInvalidData(String nik, String username, String password) {
       boolean result = auth.register(nik, username, password);
       Assert.assertTrue(result);
       System.out.println("test register dengan data tidak valid dijalankan");
    }

    @Test 
    public void testLogout() {
        boolean result = auth.logout();
        Assert.assertTrue(result);
        System.out.println("test logout");
    }

}
