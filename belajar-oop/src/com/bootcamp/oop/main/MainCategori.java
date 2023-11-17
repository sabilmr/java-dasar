package com.bootcamp.oop.main;

import com.bootcamp.oop.model.Categori;

import java.util.concurrent.Callable;

public class MainCategori {
    public static void main(String[] args) {
        Categori categori1 = new Categori(0,"C001","Elektronik");
        System.out.println(categori1);

        Categori categori2 = new Categori(1,"C002","Pakaian");
        System.out.println(categori2);

        Categori categori3 = new Categori(2,"C003","HanePhone");
        System.out.println(categori3);

        Categori categori4 = new Categori(3,"C004","Buku");
        System.out.println(categori4);

        Categori categori5 = new Categori(4,"C005","Belajar");
        System.out.println(categori5);

        Categori categori6 = new Categori(5, "C006","Menulis");
        System.out.println(categori6);

        Categori categori7 = new Categori(6,"C006","Gelas");
        System.out.println(categori7);

        Categori categori8 = new Categori(7,"C007","Leptop");
        System.out.println(categori8);

        Categori categori9 = new Categori(8,"C009","Gunting");
        System.out.println(categori9);
    }
}