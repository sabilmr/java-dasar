public class Soal06 {
    public static void main(String[] args) {
        soal6(10);
    }

    public static void soal6(int n) {
        int angka = 30;
        for (int i = 0; i < n; i++){
            System.out.print(angka +"\t");
            angka = angka - 3;
        }
    }
}
