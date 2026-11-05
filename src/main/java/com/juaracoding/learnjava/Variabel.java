package com.juaracoding.learnjava;

public class Variabel {
    public static void main(String[] args) {
        String userName = "John Doe";
        String fristName = "John";
        String lastName = "Doe";
        String nickName = "Johnny";
        String fullName = fristName + " " + lastName;
        System.out.println("userName: " + userName);
        System.out.println("fristName: " + fristName);  
        System.out.println("lastName: " + lastName);
        System.out.println("nickName: " + nickName);
        System.out.println("fullName: " + fullName);
        boolean role = false;

        if (role) {
            String admin = "Admin";
            System.out.println("admin: " + admin);
        } else {
            String user = "User";
            System.out.println("user: " + user);
        }

        Short dataShort = 25;
        int age = dataShort;
        System.out.println("age: " + age);

        int price = 16000;
        int qty = 2;
        double totalPrice = price * qty;
        System.out.println("totalPrice: " + totalPrice);

        double nilai = 95.9;
        byte dataByte = (byte) nilai;
        System.out.println("dataByte: " + dataByte);
    }
}
