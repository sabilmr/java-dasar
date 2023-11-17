package latihanlogic02;

import java.util.Scanner;

public class Soal08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Masukan angka n :");
        int n = scanner.nextInt();

        for (int i = 0; i < n; i++) {
            int angka = 1;
            for (int j = 0; j < n; j++) {
                if (i + j == n-1){
                    System.out.print(angka + "\t");
                } else {
                    System.out.println("\t");
                }
            }
            System.out.println();
        }
    }
}
