package com.juaracoding.learnjava.oop;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.Assert;

public class KaryawanTest {

    karyawan karyawan;

    @BeforeClass
    public void setUp() {
        karyawan = new karyawan("John Doe", 30, "Manager");
        System.out.println("setup sebelum test");
    }

    @Test (priority = 1)
    public void testSetAndGetNama() {
        karyawan.getNama("John Doe");
        Assert.assertEquals(karyawan.setNama(), "John Doe");
        System.out.println("test set and get nama");
    }

    @Test (priority = 2)
    public void testSetAndGetJabatan() {
        karyawan.getJabatan("Manager");
        Assert.assertEquals(karyawan.setJabatan(), "Manager");
        System.out.println("test set and get jabatan");
    }
    
    @Test (priority = 3)
    public void testsetsalary() {
        karyawan.setSalary(5000.0);
        Assert.assertEquals(karyawan.getSalary(), 5000.0);
        System.out.println("test set salary");
    }

    @Test (priority = 4)
    public void testcalculateSalary() {
        karyawan.setSalary(5000.0);
        Assert.assertEquals(karyawan.getSalary(), 5000.0);
        System.out.println("test calculate salary");
    }

    @Test (priority = 5, expectedExceptions = IllegalArgumentException.class)
    public void testSetNegativeSalary() {
        karyawan.setSalary(-1000.0);
        System.out.println("test set negative salary");
    }

    @Test (priority = 6)
    public void testcalculateTax() {
        karyawan.setSalary(5000.0);
        double tax = karyawan.getSalary() * 0.1; // Assuming 10% tax
        Assert.assertEquals(tax, 500.0);
        System.out.println("test calculate tax");
    }



}
