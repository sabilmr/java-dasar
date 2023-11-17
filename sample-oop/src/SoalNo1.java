public class SoalNo1 {
    public static void main(String[] args) {
        soal1(10);
        //fungsi n adalah untuk menentukan jumlah angka yng akan ditampilkan
        //fungsi i++ adalah menambahkan angka yng sebelumnya

    }

    public static void soal1(int n) {
        int angka = 1;
        for (int i = 0; i < n; i++) {
            System.out.print(angka +"\t");
            angka = angka + 2;
        }
    }
}