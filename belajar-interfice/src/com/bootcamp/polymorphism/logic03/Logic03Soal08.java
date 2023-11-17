package com.bootcamp.polymorphism.logic03;

import com.bootcamp.polymorphism.logic.BaseLogic;
import com.bootcamp.polymorphism.logic.SoalLogic;

public class Logic03Soal08 extends BaseLogic implements SoalLogic {
    public Logic03Soal08(int n, int m) {
        super(n, m);
    }

    @Override
    public void isiArray() {
        int angka = 1;
        int nilaitengah = n/2;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j >= nilaitengah && j - i <= nilaitengah && i <= nilaitengah) {
                    if (i % 2 == 1){
                        //kanan
                        this.array[j][i] = angka + "";
                        //kiri
                        this.array[j][n-1-i] = angka + "";
                    } else {
                        //kanan
                        this.array[n-1-j][i] = angka + "";
                        //kiri
                        this.array[n-1-j][n-1-i] = angka + "";
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
