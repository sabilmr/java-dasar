package soal01logic;

import java.util.Scanner;

public class Soal01b {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Masukan angka n :");
        int n = scanner.nextInt();

        int[][] array = new int[n][n];

        // Mengisi array
        int angka = 1;
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++){
                if (i % 2 == 0){
                    array[i][j] = angka;
                } else {
                    array[i][n-1-j] = angka;
                }
                angka += 2;
            }
        }
        // Menampilkan array
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(array[j][i] +"\t");
            }
            System.out.println();
        }
    }
}
