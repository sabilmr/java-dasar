package com.bootcamp.oop.model;

public class Hp {
    public String nama;
    public String batrai;
    public String ram;
    public String harga;

    @Override
    public String toString() {
        return "Hp{" +
                "nama='" + nama + '\'' +
                ", batrai='" + batrai + '\'' +
                ", ram='" + ram + '\'' +
                ", harga='" + harga + '\'' +
                '}';
    }
}
