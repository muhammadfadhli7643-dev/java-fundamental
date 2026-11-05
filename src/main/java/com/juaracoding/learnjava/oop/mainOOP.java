package com.juaracoding.learnjava.oop;

public class mainOOP {

    public static void main(String[] args) {
        fruit apple = new fruit();
        apple.grams = 1000/100;
        apple.calsPerGram = 52;
        System.out.println(apple.totalCals());

        fruit orange = new fruit();
        orange.grams = 1500/100;
        orange.calsPerGram = 47;
        System.out.println(orange.totalCals());

        fruit banana = new fruit();
        banana.grams = 1350/100;
        banana.calsPerGram = 89;
        System.out.println(banana.totalCals());

        kotak kotak1 = new kotak(5);
        kotak1.draw(5);
        System.out.println(kotak1.luas(5));

        kotak kotak2 = new kotak(10);
        kotak2.draw(10);
        System.out.println(kotak2.luas(10));

        karyawan karyawan1 = new karyawan("udung", 25, "Manager");
        System.out.print(karyawan1.setNama());
        System.out.println(" : " + karyawan1.setUmur());
        System.out.println(karyawan1.setJabatan());

        karyawan karyawan2 = new karyawan("asep", 30, "Staff");
        System.out.print(karyawan2.setNama());
        System.out.println(" : " + karyawan2.setUmur());
        System.out.println(karyawan2.setJabatan());

        //polymorphism
        calculator calculator = new calculator();
        calculator.sum(10, 20);
        calculator.sum(10, 20, 30);

        bidangDatar bidangDatar = new bidangDatar();
        bidangDatar.draw();
        
    }

}
