package soal11;

public class Soal11c {
    public static void main(String[] args) {
        soal11(10);
    }
    public static void soal11(int n){
        int angka = 1;
        for (int i = 0; i < n; i++){
            if (i % 2 == 0){
                System.out.print("buzz" +"\t");
            } else {
                System.out.print(angka +"\t");
                if (i < 3){
                    angka = angka + 2;
                } else {
                    angka = angka * 2;
                }
            }
        }
    }
}
