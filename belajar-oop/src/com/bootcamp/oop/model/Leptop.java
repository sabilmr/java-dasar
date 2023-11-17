package com.bootcamp.oop.model;

public class Leptop {
    public String nama;
    public String prosesor;
    public String ram;
    public String harga;

    @Override
    public String toString() {
        return "Leptop{" +
                "nama='" + nama + '\'' +
                ", prosesor='" + prosesor + '\'' +
                ", ram='" + ram + '\'' +
                ", harga='" + harga + '\'' +
                '}';
    }
}
