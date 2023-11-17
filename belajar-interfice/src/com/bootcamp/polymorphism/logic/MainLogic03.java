package com.bootcamp.polymorphism.logic;


import com.bootcamp.polymorphism.logic02.Logic02Soal07;
import com.bootcamp.polymorphism.logic03.*;

import java.util.Scanner;

public class MainLogic03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan angka n :");
        int n = scanner.nextInt();

//        System.out.println("Logic 03 Soal No 01");
//        SoalLogic soal1 = new Logic03Soal01(n,n);
//        soal1.cetakArray();

//        System.out.println("\nLogic 03 Soal No 02");
//        SoalLogic soal2 = new Logic03Soal02(n,n);
//        soal2.cetakArray();

//        System.out.println("\nLogic 03 Soal No 03");
//        SoalLogic soal3 = new Logic03Soal03(n,n);
//        soal3.cetakArray();

        System.out.println("\nLogic 03 Soal No 04");
        SoalLogic soal4 = new Logic03Soal04(n,n);
        soal4.cetakArray();


        System.out.println("\nLogic 03 Soal No 05");
        SoalLogic soal5 = new Logic03Soal05(n,n);
        soal5.cetakArray();

        System.out.println("\nLogic 03 Soal No 06");
        SoalLogic soal6 = new Logic03Soal06(n,n);
        soal6.cetakArray();

        System.out.println("\nLogic 03 Soal No 07");
        SoalLogic soal7 = new Logic03Soal07(n,n);
        soal7.cetakArray();

        System.out.println("\nLogic 03 Soal No 08");
        SoalLogic soal8 = new Logic03Soal08(n,n);
        soal8.cetakArray();

        System.out.println("\n Logic 03 Soal No 09");
        SoalLogic soal9 = new Logic03Soal09(n,n);
        soal9.cetakArray();

        System.out.println("\nLogic 03 Soal No 10");
        SoalLogic soal10 = new Logic03Soal10(n,n);
        soal10.cetakArray();

//        System.out.println("\nLogic 03 Soal No 14");
//        SoalLogic soal14  = new Logic03Soal14(n,n);
//        soal14.cetakArray();


    }
}
