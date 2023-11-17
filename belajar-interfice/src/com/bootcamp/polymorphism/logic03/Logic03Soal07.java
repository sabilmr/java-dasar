package com.bootcamp.polymorphism.logic03;

import com.bootcamp.polymorphism.logic.BaseLogic;
import com.bootcamp.polymorphism.logic.SoalLogic;

public class Logic03Soal07 extends BaseLogic implements SoalLogic {
    public Logic03Soal07(int n, int m) {
        super(n, m);
    }

    @Override
    public void isiArray() {
        int angka = 1;
        int nilaitengah = n/2;
        for (int i = 0; i  < n; i ++) {
            for (int j = 0; j < n; j++) {
                if (i + j >= nilaitengah && j - i <= nilaitengah && i <= nilaitengah){
                    if (i % 2 == 1){
                        //atas
                        this.array[i][j] = angka + "";
                        //bawah
                        this.array[n-1-i][j] = angka + "";
                    } else {
                        int geser = n-1-i;
                        //atas
                        this.array[i][n-1-j] = angka + "";
                        //bawah
                        this.array[geser][n-1-j] = angka + "";
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
