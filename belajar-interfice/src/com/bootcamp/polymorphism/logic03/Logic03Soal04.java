package com.bootcamp.polymorphism.logic03;

import com.bootcamp.polymorphism.logic.BaseLogic;
import com.bootcamp.polymorphism.logic.SoalLogic;

public class Logic03Soal04 extends BaseLogic implements SoalLogic {
    public Logic03Soal04(int n, int m) {
        super(n, m);
    }

    @Override
    public void isiArray() {
        int angka = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j >= n - 1) {
                    if (i % 2 == 1) {
                        this.array[i][j] = String.valueOf(angka);
                    } else {
                        int geser = n-1-i;
                        this.array[i][n-1-j+geser] = String.valueOf(angka);
                    }
                    angka += 2;
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
