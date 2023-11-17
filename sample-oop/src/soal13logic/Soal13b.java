package soal13logic;

import java.util.Scanner;

public class Soal13b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan angka n :");
        int n = scanner.nextInt();

        int[][] array = new int[n][n];
        int angka = 1;
        for (int i = 0; i < n; i++) {

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
                if (j + i >= n-1 && j <= i){
                    System.out.print(array[i][j] +"\t");
                } else if (j + i <= n-1 && j >= i){
                    System.out.print(array[i][j] +"\t");
                } else {
                    System.out.print("\t");
                }
            }
            System.out.println();
        }
    }
}
