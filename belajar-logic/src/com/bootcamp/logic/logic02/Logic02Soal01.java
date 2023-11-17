package com.bootcamp.logic.logic02;

import com.bootcamp.logic.SoalLogic;

import java.util.Scanner;

public class Logic02Soal01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan nilai n :");
        int n = scanner.nextInt();

        SoalLogic soal1 = new SoalLogic(n,n);
        int angka = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                soal1.array[i][j] = angka+"\t";
                angka += 3;
            }
        }
        soal1.cetakAarray();
    }
}
