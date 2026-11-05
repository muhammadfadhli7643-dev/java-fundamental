package com.juaracoding.learnjava.oop;

public class bidangDatar {

    // overriding
    void draw (){
        System.out.println("Default draw");
    }

}

class segitiga extends bidangDatar {

    @Override 
    void draw (){
        System.out.println("Gambar segitiga");
    }

}

class lingkaran extends bidangDatar {

    @Override 
    void draw (){
        System.out.println("Gambar lingkaran");
    }

}
