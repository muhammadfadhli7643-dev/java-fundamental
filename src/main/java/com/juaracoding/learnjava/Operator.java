package com.juaracoding.learnjava;

public class Operator {

    public static void main(String[] args) {
        //subtotal
        //diskon
        //like count
        //tombol increment dan decrement
        //rata rata rating

        int modulus = 10 % 3;
        System.out.println("modulus: " + modulus); 

        int x = 2;
        int num1 = 10 * x++;    //suffix
        System.out.println(x);
        System.out.println(num1);

        int y = 2;
        int num2 = 10 * ++y;    //prefix
        System.out.println(num2);

        int a = 4;
        int b = 2;
        int c = 8;
        int d = 1;

        double myVal1 = a + b % d - c * d / b;
        System.out.println(myVal1);

        double myVal2 = (a + (b % d)) - ((c * d)/ b);
        System.out.println(myVal2);

        int num3 = a + c * b;
        System.out.println(num3);

        int num4 = b * (d + a);
        System.out.println(num4);
        
        int e = 10000;
        int f = 5000;
        e += f;   //e = e +f
        System.out.println(e);

        //operator perbandingan
        //gerbang logika 
        //bitwise

        int hasil = 10 & 12;
        System.out.println(hasil);

    }

}
