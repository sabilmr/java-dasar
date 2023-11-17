package com.bootcamp.polymorphism.logic;

import com.bootcamp.polymorphism.logic02.*;

import java.util.Scanner;

public class MainLogic02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan angka n :");
        int n = scanner.nextInt();

        System.out.println("Logic 02 Soal No 1");
        SoalLogic soal1 = new Logic02Soal01(n);
        soal1.cetakArray();

        System.out.println("\nLogic 02 Soal No 2");
        SoalLogic soal2 = new Logic02Soal02(n);
        soal2.cetakArray();

        System.out.println("\nLogic 02 Soal No 3");
        SoalLogic soal3 = new Logic02Soal03(n);
        soal3.cetakArray();

        System.out.println("\nLogic 02 Soal No 4");
        SoalLogic soal4 = new Logic02Soal04(n);
        soal4.cetakArray();

        System.out.println("\nLogic 02 Soal No 5");
        SoalLogic soal5 = new Logic02Soal05(n);
        soal5.cetakArray();

        System.out.println("\nLogic 02 Soal No 6");
        SoalLogic soal6 = new Logic02Soal06(n);
        soal6.cetakArray();

        System.out.println("\nLogic 02 Soal No 7");
        SoalLogic soal07 = new Logic02Soal07(n);
        soal07.cetakArray();

        System.out.println("\nLogic 02 Soal No 8");
        SoalLogic soal08 = new Logic02Soal08(n);
        soal08.cetakArray();

        System.out.println("\nLogic 02 Soal No 9");
        SoalLogic soal09 = new Logic02Soal09(n);
        soal09.cetakArray();

        System.out.println("\nLogic 02 Soal No 10");
        SoalLogic soal10 = new Logic02Soal10(n);
        soal10.cetakArray();

        System.out.println("\nLogic 02 Soal No 11");
        SoalLogic soal11 = new Logic02Soal11(n);
        soal11.cetakArray();

        System.out.println("\nLogic 02 Soal No 12");
        SoalLogic soal12 = new Logic02Soal12(n);
        soal12.cetakArray();

        System.out.println("\nLogic 02 Soal No 13");
        SoalLogic soal13 = new Logic02Soal13(n);
        soal13.cetakArray();

    }
}