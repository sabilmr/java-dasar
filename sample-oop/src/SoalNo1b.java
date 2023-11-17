public class SoalNo1b {
    public static void main(String[] args) {
        soal02( 10);
    }
    public static void soal02(int n) {
        int angka = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(angka +"\t");
            angka = angka + 1;
        }
    }
}
