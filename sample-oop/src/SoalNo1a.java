public class SoalNo1a {
    public static void main(String[] args) {
        soal01( 10);
    }
    public static void soal01(int n) {
        int angka = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(angka +"\t");
            angka = angka + 2;
        }
    }
}
