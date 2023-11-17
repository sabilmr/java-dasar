public class SoalNo1f {
    public static void main(String[] args) {
        soal1f( 10);
    }

    public static void soal1f(int n) {
        int angka = 1;
        for ( int i = 0; i < n; i++) {
            System.out.println(angka +"\t");
            angka = angka + 2;
        }
    }


}
