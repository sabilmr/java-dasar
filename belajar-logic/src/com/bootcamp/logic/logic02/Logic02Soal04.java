package com.bootcamp.logic.logic02;

import com.bootcamp.logic.SoalLogic;

import java.util.Scanner;

public class Logic02Soal04 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukan angka n :");
        int n = scanner.nextInt();

        SoalLogic soal4 = new SoalLogic(n,n);
        int angka = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i % 2 == 0){
                    soal4.array[i][j] = angka + "\t";
                } else {
                    soal4.array[i][j] = angka + "\t";
                }
                angka += 3;
            }
        }
        soal4.cetakAarray();
    }
}

