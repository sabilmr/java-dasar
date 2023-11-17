package latihanlogic02;

import java.util.Scanner;

public class Soal07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukan angka n :");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int angka = 1;
            for (int j = 0; j < n; j++) {
                if (i == j){
                    angka += 2;
                    System.out.print("\t");
                }
            }
        }
    }
}