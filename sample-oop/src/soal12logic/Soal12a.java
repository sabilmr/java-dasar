package soal12logic;

import java.util.Scanner;

public class Soal12a {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan angka n :");
        int n = scanner.nextInt();

        int[][] array = new int[n][n];
        for (int i = 0; i < n; i++) {
            int angka = 1;
            for (int j = 0; j < n; j++) {
                if (i % 2 == 0){
                    array[i][j] = angka;
                } else {
                    array[i][j] = angka;
                }
                angka += 2;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i + j <= n-1 && i >= j){
                System.out.print(array[i][j] +"\t");
            } else if (i + j >= n-1 && i <= j){
                    System.out.print(array[i][j] +"\t");
                }else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}


