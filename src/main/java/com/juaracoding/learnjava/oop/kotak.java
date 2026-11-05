package com.juaracoding.learnjava.oop;

public class kotak {

    int sisi;

    kotak (int sisi){
        this.sisi = sisi;
    }

    void draw (int sisi){
        for (int i = 0; i < sisi; i++){
            for (int j = 0; j < sisi; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }

    int luas(int sisi){
        return sisi * sisi;
    }

}
