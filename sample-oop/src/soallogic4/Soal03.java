package soallogic4;

import utils.DeretAngka;
import utils.InputData;
import utils.PrintArray;

import java.util.Scanner;

public class Soal03 {
    public static void main(String[] args) {
        int n = InputData.input(new Scanner(System.in));

        int[] genap = DeretAngka.Genap(n);

        int[][] array = new int[n][n];

        int indexTerakhir = n-1 ;
        for (int i = 0; i < n; i++) {
            array[n-1-i][i] = genap[indexTerakhir];
            array[0][i] = genap[i];
            array[i][0] = genap[i];
            array[n-1][i] = genap[indexTerakhir];
            array[i][n-1] = genap[indexTerakhir];
            array[i][i] = genap[i];

            indexTerakhir--;
        }

       PrintArray.printArray(array);
    }
}
