package com.bootcamp.oop.model;

public class Kendaraan {
    public String jk;

    public String nama;
    public Integer roda;
    public String platnomor;

    @Override
    public String toString() {
        return "Kendaraan{" +
                "kendaraan='" + jk + '\'' +
                ", nama=" + nama +
                ", roda='" + roda + '\'' +
                ", platnomor=" + platnomor +
                '}';
    }
}
