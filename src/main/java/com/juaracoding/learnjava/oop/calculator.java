package com.juaracoding.learnjava.oop;

public class calculator {

    // overloading
    void sum (int a, int b){
        System.out.println(a + b);
    }

    void sum (int a, int b, int c){
        System.out.println(a + b + c);
    }

    public int add (int a, int b){
        return a + b;
    }

    public int subtract (int a, int b){
        return a - b;
    }
}
