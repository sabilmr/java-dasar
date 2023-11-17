public class SoalNo1e {
    public static void main(String[] args) {
        soal1e( 10);
    }

    public static void soal1e(int n) {
        int angka = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(angka +"\t");
            angka = angka + 2;
        }
    }
}
