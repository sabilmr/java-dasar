package soal03;

public class Soal03d {
    public static void main(String[] args) {
        soal3(10);
    }

    public static void soal3(int n) {
        int angka = 3;
        for (int i = 0; i < n; i++) {
            System.out.println(angka + "\t");
            angka = angka + 3;
        }
    }
}
