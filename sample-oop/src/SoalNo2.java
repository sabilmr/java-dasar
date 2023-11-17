public class SoalNo2 {
    public static void main(String[] args) {
        soal3(10);
    }

    public static void soal3(int n) {
        int angka  = 2;
        for (int i = 0; i < n; i++) {
            System.out.print(angka + "\t");
            angka = angka + 2;
        }
    }
}



