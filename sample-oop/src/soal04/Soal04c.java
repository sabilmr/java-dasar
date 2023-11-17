package soal04;

public class Soal04c {
    public static void main(String[] args) {
        soal4(10);
    }

    public static void soal4(int n) {
        int angka = 19;
        for(int i = 0; i < n; i++) {
            System.out.print(angka +"\t");
            angka = angka -2;
        }
    }
}
