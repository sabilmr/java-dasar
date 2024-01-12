package soallogic4;

import utils.DeretAngka;
import utils.InputData;
import utils.PrintArray;

import java.util.Scanner;

public class Soal02 {
    public static void main(String[] args) {
        int n = InputData.input(new Scanner(System.in));

        int[] ganjil = DeretAngka.ganjil(n);

        int[][] array = new int[n][n];
        int indexTerakhir = n-1;

        for (int i = 0; i < n; i++) {
            array[0][i] = ganjil[i];
            array[i][0] = ganjil[i];
            array[n-1][i] = ganjil[indexTerakhir];
            array[i][n-1] = ganjil[indexTerakhir];

            indexTerakhir --;
        }

        PrintArray.printArray(array);
    }
}
