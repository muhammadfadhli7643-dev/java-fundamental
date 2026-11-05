package com.juaracoding.learnjava;

import java.util.Scanner;
import java.util.Arrays;

public class Array {

    public static void main(String[] args) {
        
        String[] product = {"laptop", "hp", "keyboard", "mouse", "printer", "pc"};
        System.out.println(product[0]);
        
        System.out.println("Jumlah data: " + product.length);

        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        for (int i = 0; i < cars.length; i++) {
            System.out.println(cars[i].toUpperCase());
        }

        int num[][] = {{1,2,3,4},{5,6,7}};
        System.out.println(num[0][1]);
        for (int i = 0; i < num.length; i++) {
            for (int j = 0; j < num[i].length; j++) {
                System.out.print(num[i][j] + " ");
            }
            System.out.println();
        }

        //sort
        int numbers [] = {2,78,33,1,9,10};
        Arrays.sort(numbers);
        System.out.println(Arrays.toString(numbers));

        String city [] = {"jakarta", "padang", "bandung", "surabaya", "pekanbaru", "batam"};
        String kotaTerpanjang = " ";
        int index = 0;
            for (int i = 0; i < city.length; i++){
                if (city[i].length() > kotaTerpanjang.length());{
                    kotaTerpanjang = city[i];
                    index = i;
                }
            }
            System.out.println(kotaTerpanjang + " index ke: " + index);


        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukkan jumlah data: ");
        int jumlah = scanner.nextInt();
        int prices [] = new int [jumlah];
        for (int j = 0; j < prices.length; j++) {
            System.out.println("Masukkan harga : ");
            prices[j] = scanner.nextInt();
            int total = (scanner.nextInt() + prices[j]);
            System.out.println("harga total: " + total);
        }
        scanner.close();
    }
}
