package com.bootcamp.polymorphism.logic02;

import com.bootcamp.polymorphism.logic.SoalLogic;

public class Logic02Soal05 implements SoalLogic {
    private int n;
    private int[][] array;

    public Logic02Soal05(int n) {
        this.n = n;
        this.array = new int[n][n];
    }

    @Override
    public void isiArray() {
        int angka = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i % 2 == 0){
                    this.array[i][j] = angka;
                } else {
                    this.array[i][n-1-j] = angka;
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
                System.out.print(this.array[i][j] + "\t");
            }
            System.out.println();

        }
    }
}
