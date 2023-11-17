package soal02logic;

import java.util.Scanner;

public class Soal02b {
    public static void main(String[] args){
        Scanner scanner = new Scanner (System.in);
        System.out.print("masukan angka : n");
        int n = scanner.nextInt();

        int[][] array = new int[n][n];
        for(int i = 0; i < n; i++){
            int angka = 2;
            for (int j = 0; j < n; j++){
                if (i % 2 == 0){
                    array[j][i] = angka;
                } else {
                    array[j][i] = angka;
                }
                angka += 2;
            }
                }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[j][i] +"\t");
            }
            System.out.println();
        }
    }
}
