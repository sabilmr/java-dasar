package soal12;

public class Soal12a {
    public static void main(String[] args) {
        soal12(12);
    }
    public static void soal12(int n) {
        int angka = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(angka + "\t");
            angka += 2;
            if (i % 4 == 3){
                angka = 1;
        }
    }
}
}



