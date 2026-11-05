package com.juaracoding.learnjava.oop;

public class manager extends karyawan {
    private String departemen;

    public manager(String nama, int umur, String jabatan, String departemen) {
        super(nama, umur, jabatan);
        this.departemen = departemen;
    }

    public String getDepartemen() {
        return departemen;
    }
}
