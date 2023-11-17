package com.bootcamp.oop.main;

import com.bootcamp.oop.model.Leptop;

public class MainLeptop {
    public static void main(String[] args) {
        Leptop leptop1 = new Leptop();
        leptop1.nama = "Asus Zephyrus";
        leptop1.prosesor = "i7";
        leptop1.ram = "16GB";
        leptop1.harga = "Rp 8.000.000";
        System.out.println("leptop1" + leptop1);

        Leptop leptop2 = new Leptop();
        leptop2.nama = " Lenovo ThinkBook";
        leptop2.prosesor = "intel i3";
        leptop2.ram = "8GB";
        leptop2.harga = "Rp 10.000.000";
        System.out.println("leptop2" + leptop2);

        Leptop leptop3 = new Leptop();
        leptop3.nama = "Acer Swift";
        leptop3.prosesor = "i7";
        leptop3.ram = "16GB";
        leptop3.harga = "Rp 12.000.000";
        System.out.println("leptop3" + leptop3);

        Leptop leptop4 = new Leptop();
        leptop4.nama = "Huawei Matebook";
        leptop4.prosesor = "Intel i7-10510U";
        leptop4.ram = "16GB";
        leptop4.harga = "Rp 10.000.000";
        System.out.println("leptop4" + leptop4);

        Leptop leptop5 = new Leptop();
        leptop5.nama = "Asus Vivo Book 15";
        leptop5.prosesor = "Intel Celenor N40";
        leptop5.ram = "4GB";
        leptop5.harga = "Rp 4.000.000";
        System.out.println("leptop5" + leptop5);


    }
}

