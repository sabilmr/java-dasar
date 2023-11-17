package main;

import model.Kendaraan;
import model.Sepeda;

public class MainKendaraan {
    public static void main(String[] args) {
        Kendaraan kendaraan1 = new Kendaraan("Toyota","Avanza","Mobil");
        System.out.println(kendaraan1);

        Sepeda sepeda1 = new Sepeda("Honda","Vario","Sepeda","Rp 20.000.000");
        System.out.println(sepeda1);
    }
}
