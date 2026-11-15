package com.juaracoding.learnjava.oop;

import java.util.ArrayList;
import java.util.List;

public class SampleCollection {
    public static void main(String[] args) {
        List<String> cars = new ArrayList<String>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        System.out.println(cars.get(1));
    }

}
