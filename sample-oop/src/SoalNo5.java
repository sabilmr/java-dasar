public class SoalNo5 {
    public static void main(String[] args) {
        soal5(10);
    }

    public static void soal5(int n) {
        int angka = 20;
        for (int i = 0; i < n; i++){
            System.out.print(angka +"\t");
            angka = angka - 2;
        }

    }
}