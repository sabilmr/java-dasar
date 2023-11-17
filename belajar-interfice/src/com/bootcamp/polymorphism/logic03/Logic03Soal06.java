package com.bootcamp.polymorphism.logic03;

import com.bootcamp.polymorphism.logic.BaseLogic;
import com.bootcamp.polymorphism.logic.SoalLogic;

public class Logic03Soal06 extends BaseLogic implements SoalLogic {
    public Logic03Soal06(int n, int m) {
        super(n, m);
    }

    @Override
    public void isiArray() {
        int angka = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i <= j && i + j <= n-1){
                    if (i % 2 == 0){
                        //atas
                        this.array[i][j] = String.valueOf(angka);
                        //bawah
                       this.array[n-1-i][j] = String.valueOf(angka);
                    } else {
                        //atas
                        this.array[i][n-1-j] = String.valueOf(angka);
                        //bawah
                        this.array[n-1-i][n-1-j] =String.valueOf(angka);
                    }
                    angka += 2;
                }
            }
        }
    }

    @Override
    public void cetakArray() {
        this.isiArray();
        super.cetakArray();
    }
}
