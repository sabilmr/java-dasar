package soal13;

public class Soal13a {
    public static void main(String[] args){
        soal13(12);
    }

    public static void soal13(int n) {
        int angka = 2;
        for (int i = 0; i < n; i++) {
            System.out.print(angka +"\t");
            angka *= 2;
            if (i % 5 == 4){
                angka = 2;
            }
        }
    }

}
