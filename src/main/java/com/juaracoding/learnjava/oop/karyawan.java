package com.juaracoding.learnjava.oop;

public class karyawan {
    private String nama;
    private int umur;
    private String jabatan;
    private double salary;

    karyawan(String nama, int umur, String jabatan){
        this.nama = nama;
        this.umur = umur;
        this.jabatan = jabatan;
    }

    void printData(){

    }

    public void getNama(String nama) {
        this.nama = nama;
    }

    public String setNama() {
        return nama;
    }

    public void getUmur(int umur) {
        this.umur = umur;
    }

    public int setUmur() {
        return umur;
    }

    public void getJabatan(String jabatan) {
        this.jabatan = jabatan;
    }

    public String setJabatan() {
        return jabatan;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        if (salary < 0) {
            throw new IllegalArgumentException("Salary cannot be negative");
        }
        this.salary = salary;
    }

    public void displayInfo() {
        System.out.println("Nama: " + nama);
        System.out.println("Umur: " + umur);
        System.out.println("Jabatan: " + jabatan);
        System.out.println("Salary: " + salary);
    }

    public double calculateAnnualSalary() {
        return salary * 12;
    }

    public double calculateTax() {
        return salary * 0.1; //10% tax
    }

}
