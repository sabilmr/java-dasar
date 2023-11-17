package com.bootcamp.polymorphism.logic02;

import com.bootcamp.polymorphism.logic.SoalLogic;

public class Logic02Soal08 implements SoalLogic {

    private int n;
    private int[][] array;

    public Logic02Soal08(int n) {
        this.n = n;
        this.array = new int[n][n];
    }

    @Override
    public void isiArray() {
        for (int i = 0; i < n; i++) {
            int angka = 1;
            for (int j = 0; j < n; j++) {
                if (i + j == n-1) {
                    this.array[i][j] = angka;
                }
                angka += 2;
            }
        }
    }

    @Override
    public void cetakArray() {
        this.isiArray();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (this.array[i][j] == 0) {
                    System.out.print("\t");
                } else {
                    System.out.print(this.array[i][j] + "\t");
                }
            }
            System.out.println("\t");
        }
    }
}
