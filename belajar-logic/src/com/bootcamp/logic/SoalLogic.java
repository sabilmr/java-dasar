package com.bootcamp.logic;

public class SoalLogic {
    private Integer n;
    private Integer m;
    public String[][] array;

    public SoalLogic(Integer n, Integer m) {
        this.n = n;
        this.m = m;
        this.array = new String[n][m];
    }
    public void cetakAarray(){
        for (int i = 0; i <this.n; i++) {
            for (int j = 0; j < this.m; j++) {
                System.out.print(array[i][j]+ "\t");
            }
            System.out.println();
        }
        System.out.println();
    }
}
