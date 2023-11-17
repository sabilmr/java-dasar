package soal07;

public class Soal07c {
    public static void main(String[] args){
    System.out.println("nilai = 10");
    soal7(10);
    System.out.println();
    System.out.println("nilai = 11");
    soal7(11);
    System.out.println();

    }
    public static void soal7(int n){
        int angka = 1;
        int nilaitengah = n/2;
        if (n % 2 == 0){
            nilaitengah --;
        }
        for(int i = 0; i < n; i++){
            System.out.print(angka +"\t");
            if (i < nilaitengah){
                angka = angka + 2;
            }else{
                if(n % 2 == 0 && i == nilaitengah){
                    continue;
                }
                angka = angka - 2;
            }
        }
    }
}
