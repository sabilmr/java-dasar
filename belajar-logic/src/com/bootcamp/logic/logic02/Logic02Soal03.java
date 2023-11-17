package com.bootcamp.logic.logic02;

import com.bootcamp.logic.SoalLogic;

import java.util.Scanner;

public class Logic02Soal03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukan nilai angka n :");
        int n = scanner.nextInt();

        SoalLogic soal3 = new SoalLogic(n, n);
        int angka = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i % 2 == 0) {
                    soal3.array[i][j] = angka + "\t";
                } else {
                    soal3.array[i][j] = angka + "\t";
                }
                angka += 4;
            }
        }
        soal3.cetakAarray();
    }
}