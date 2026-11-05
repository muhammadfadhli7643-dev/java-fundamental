package com.juaracoding.learnjava.oop;

public class karyawan {
    private String nama;
    private int umur;
    private String jabatan;

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

}
