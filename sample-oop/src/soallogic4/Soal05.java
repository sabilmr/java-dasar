package soallogic4;

import utils.DeretAngka;
import utils.InputData;

import java.util.Scanner;

public class Soal05 {
    public static void main(String[] args) {
        int n = InputData.input(new Scanner(System.in));

        int[] fibo = DeretAngka.fibo(n, 3);

        int nTengah = n/2;
        for (int i = 0; i < n; i++) {
            int indexKolom = 0;
            for (int j = 0; j < n; j++) {
                char huruf = (char)('A' + j);

                if (i + j <= n-1 && i >= j && j < nTengah){
                    System.out.print(huruf + "\t" );
                } else if (i + j >= n-1 && i <= j) {
                    System.out.print(fibo[indexKolom] + "\t");
                } else {
                    System.out.print("\t");
                }
                indexKolom++;
            }

            System.out.println();
        }
    }
}
