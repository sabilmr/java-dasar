package com.bootcamp.polymorphism.logic03;

import com.bootcamp.polymorphism.logic.BaseLogic;
import com.bootcamp.polymorphism.logic.SoalLogic;

public class Logic03Soal14 extends BaseLogic implements SoalLogic {

    public Logic03Soal14(int n, int m) {
        super(n, m);
    }

    @Override
    public void isiArray() {
        int angka = 1;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i % 2 == 0){
                    this.array[j][i] = angka + "";
                } else {
                    this.array[j][n- 1 -i] = angka + "";
                }
                angka += 2;
            }
        }
    }

    @Override
    public void cetakArray() {
        this.isiArray();
        super.cetakArray();
    }
}
