package com.juaracoding.learnjava;

import java.util.Scanner;

public class Perulangan {

    public static void main (String[] args) {

        for (int i = 0; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println("Bilangan genap: " + i);
            } 

            if (i % 2 != 0) {
                System.out.println("Bilangan ganjil: " + i);
            } 

        }

        for (int i = 0; i <= 10; i++) {
                System.out.println("Bilangan genap: " + i);
                i++; 
        }
        // kotak
        int sisi = 10;
        for (int i = 0; i < sisi; i++) {
            for (int j = 0; j < sisi; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        // segitiga
        int tinggi = 5;
        for (int i = 1; i <= tinggi; i++){
            for (int j = 1; j <= i; j++){
                if (j % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
        for (int i = tinggi; i >= 1; i--){
            for (int j = 1; j <= i; j++){
                if (i % 2 == 0) {
                    System.out.print("1");
                } else {
                    System.out.print("0");
                }
            }
            System.out.println();
        }

        // while
        int x = 1;
        while (x < 1){
            System.out.print("x = " + x);
            x++;
        }

        //do while
        int y = 1;
        do{
            System.out.print("y = " + y);
            y++; 
        } while (y < 1);

        System.out.println();

        Scanner scanner = new Scanner(System.in);

        //Login
        String userName = "admin";
        String password = "admin123";

            int batas = 3;
            while (batas > 0){
                System.out.println("Masukkan Username: ");
                String inputUserName = scanner.nextLine();
                System.out.println("Masukkan Password: ");
                String inputPassword = scanner.nextLine();
                if (inputUserName.equals(userName)&& inputPassword.equals(password)){
                    System.out.println("login berhasil");
                    break;
                } else{
                    System.out.println("Username atau Password salah, Silahkan coba lagi");
                    batas--;
                    System.out.println("Sisa percobaan: " + batas);
                    if (batas == 0){
                        System.out.println("Akun anda di blokir sementara harap hubungi CS ");
                        break;
                    }
                }   
            }

        int sum = 0;
        while (true){
            System.out.print("Silahkan Masukkan angka: ");
            int angka = scanner.nextInt();
            System.out.println(angka);
            if (angka >= 100){
                System.out.println("Angka yang dimasukkan terlalu besar: " + angka);
                break;
            }
            sum += angka;
            if (sum >= 100){
                System.out.println("Total angka yang dimasukkan sudah terlalu besar: " + sum);
                break;
            }

        }
    }
}
