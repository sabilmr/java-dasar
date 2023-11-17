package com.bootcamp.oop.model;

public class Orang {
    public String nama;
    public String jenisKelamin;
    public String alamat;
    public Integer umur;

    @Override
    public String toString() {
        return "Orang{" +
                "nama='" + nama + '\'' +
                ", jenisKelamin='" + jenisKelamin + '\'' +
                ", alamat='" + alamat + '\'' +
                ", umur=" + umur +
                '}';
    }
}
