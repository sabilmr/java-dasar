package soal09;

public class Soal09c {
    public static void main(String[] args) {
        System.out.println("nilai = 10");
        soal9(10);
        System.out.println();
        System.out.println("nilai = 11");
        soal9(11);
        System.out.println();
    }
    public static void soal9(int n) {
        int angka = 3;
        int nilaitengah = n/2;
        if (n % 2 == 0) {
            nilaitengah --;
        }
        for (int i = 0; i < n; i++){
            System.out.print(angka +"\t");
            if (i < nilaitengah){
                angka = angka + 3;
            } else {
                if (n % 2 == 0 && i == nilaitengah){
                    continue;
                }
                angka = angka - 3;
            }
        }
    }
}
