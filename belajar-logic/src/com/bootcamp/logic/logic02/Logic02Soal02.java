package com.bootcamp.logic.logic02;

import com.bootcamp.logic.SoalLogic;

import java.util.Scanner;

public class Logic02Soal02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan nilai n : ");
        int n = scanner.nextInt();

        SoalLogic soal2 = new SoalLogic(n, n);
        int angka = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i % 2 == 0) {
                    soal2.array[i][j] = angka + "\t";
                } else {
                    soal2.array[i][n-1-j] = angka + "\t";
                }
                angka += 2;
            }
        }
        soal2.cetakAarray();
    }
}

