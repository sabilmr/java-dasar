public class SoalNo1c {
    public static void main(String[] args) {
        soal1b( 10);
    }
    public static void soal1b( int n) {
        int angka = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(angka +"\t");
            angka = angka + 2;
        }
    }
}
