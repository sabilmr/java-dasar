package soal10;

public class Soal10d {
    public static void main(String[] args){
        soal10(10);
    }
    public static void soal10(int n){
        int angka = 2;
        for (int i = 0; i < n; i++) {
            if (i % 2 == 0){
                System.out.print(angka + "\t");
                angka = angka * 2;
            } else {
                System.out.print("fizz" + "\t");
            }
        }
    }
}
