package soal02;

public class Soal02f {
    public static void main(String[] args) {
        soal2(10);
    }

    public static void soal2(int n) {
        int angka = 2;
        for (int i = 0; i < n; i++) {
            System.out.print(angka +"\t");
            angka = angka + 2;
        }
    }
}
