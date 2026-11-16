package com.juaracoding.learnjava.oop;

public class Auth {

    public boolean login(String username, String password) {
        return username.equals("admin") && password.equals("admin123");
    }

    public boolean register(String nik, String username, String password) {
        if (nik == null || nik.isEmpty() || username == null || username.isEmpty() || password == null || password.isEmpty()) {
            throw new IllegalArgumentException("NIK, username, and password cannot be empty");
        }else if (nik.length() != 16 || !nik.matches("\\d+")) {
            throw new IllegalArgumentException("NIK must be 16 characters long and contain only digits");
        }else if (password.length() < 8) {
            throw new IllegalArgumentException("Password must be at least 8 characters long");
        }else {
            System.out.println("User registered successfully with NIK: " + nik + ", Username: " + username);
        }
        return true;
    }

    public boolean logout() {
        return true;
    }

}
