package com.juaracoding.learnjava;
import java.util.Scanner;
import java.util.Random;

public class Percabangan {
   
    public static void main(String[] args){

        int minPembelian = 1;
        int jumlahPembelian = 6;

       if (jumlahPembelian >= minPembelian) {
           System.out.println("lanjutkan pembelian");
       } else {
           System.out.println("Mohon tambahkan jumlah pembelian");
       }

       int pembelian = 5000000;
       int batasDiskon = 500000;
       int diskon = pembelian / 100000;

         if (pembelian >= batasDiskon) {
              System.out.println("Selamat anda mendapatkan diskon sebesar " + diskon + " %");
         } else if (pembelian == batasDiskon) {
              System.out.println("Mohon maaf anda tidak mendapatkan diskon");
         } else {
              System.out.println("Mohon maaf anda tidak mendapatkan diskon");
         }

       int pengahasilan = 7000000;
       int batasPajak = 5000000;

       if (pengahasilan > batasPajak) {
           System.out.println("Anda wajib membayar pajak");
       } else if (pengahasilan == batasPajak) {
           System.out.println("Anda tidak wajib membayar pajak");
       } else {
           System.out.println("Anda tidak wajib membayar pajak");
       }

       int bilangan = 10;
       if (bilangan % 2 == 0 ){
              System.out.println("Bilangan genap");
         } else {
              System.out.println("Bilangan ganjil");
       }

       Random random = new Random();
       int otpValue = 100000 + random.nextInt(900000);
       System.out.println("OTP Value: " + otpValue);

       try (Scanner input = new Scanner(System.in)) {
        int inputOtp = input.nextInt();
           if (inputOtp == otpValue) {
               System.out.println("OTP Valid");
           } else {
               System.out.println("OTP Tidak Valid");
           }

         // switch
         System.out.println("Menu Aplikasi");
         System.out.println("1. Cek Saldo");
         System.out.println("2. Deposit");
         System.out.println("3. Tarik Tunai");
         System.out.println("4. Transfer");
         System.out.println("5. Keluar");
         System.out.print("Pilih menu: ");
         int menu = input.nextInt();
         switch (menu) {
            case 1:
                 System.out.println("Cek Saldo");
                 break;
            case 2:
                 System.out.println("Deposit");
                 break;
            case 3:
                 System.out.println("Tarik Tunai");
                 break;
            case 4:
                 System.out.println("Transfer");
                 break;
            case 5:
                System.exit(0);
            default:
                 System.out.println("Menu tidak tersedia");
             }
        }
    }

}
