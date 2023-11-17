package soal04logic;

import java.util.Scanner;

public class Soal04b{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan angka n :");
        int n = scanner.nextInt();

        int angka = 1;
        int[][] array = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i % 2 == 0){
                    array[i][j] = angka;
                } else {
                    array[i][j] = angka;
                }
                angka += 3;
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[i][j] +"\t");
            }
            System.out.println();
        }
    }
}
