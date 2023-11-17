package com.bootcamp.polymorphism.logic03;

import com.bootcamp.polymorphism.logic.BaseLogic;
import com.bootcamp.polymorphism.logic.SoalLogic;

public class Logic03Soal10 extends BaseLogic implements SoalLogic {
    public Logic03Soal10(int n, int m) {
        super(n, m);
    }

    @Override
    public void isiArray() {
        int nilaitengah = n / 2;
        for (int i = 0; i < n; i++) {
            int angka = 9;
            for (int j = 0; j < n; j++) {
                if (i + j >= nilaitengah && j - i <= nilaitengah && i <= nilaitengah) {
                    if (i % 2 == 0) {
                        //atas
                        this.array[i][j] = String.valueOf(angka);
                        //bawah
                        this.array[n-1-i][j] = String.valueOf(angka);
                    } else {
                        //atas
                        this.array[n-1-i][j] = String.valueOf(angka);
                        //bawah
                        this.array[i][n-1-j] = String.valueOf(angka);
                    }
                    if (j < nilaitengah){
                        angka -= 2;
                    } else {
                        angka += 2;
                    }
                }
            }
        }
    }



        @Override
        public void cetakArray () {
            this.isiArray();
            super.cetakArray();
        }
    }
