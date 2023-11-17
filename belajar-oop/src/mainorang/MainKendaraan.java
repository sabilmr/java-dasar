package mainorang;

import orangmodel.Kendaraan;
import orangmodel.Pesawat;
import orangmodel.Sepeda;

public class MainKendaraan {
    public static void main(String[] args) {
        Kendaraan kendaraan1 = new Kendaraan("Yoyota","Mobil Avanza",80_000_000);
        System.out.println(kendaraan1);
        Kendaraan kendaraan2 = new Kendaraan("Mercedes Benz E","Mobil Sedan",400_000_000);
        System.out.println(kendaraan2);

        Pesawat pesawat1 = new Pesawat("Airbus","F10",100_000_000,"Sabil","Bali Papan");
        System.out.println("Pesawat " + pesawat1);
        Pesawat pesawat2 = new Pesawat("ATR 72","Garuda",500_000_000,"Om Andri","Surabaya");
        System.out.println("Pesawat " + pesawat2);

        Sepeda sepeda1 = new Sepeda("Honda","Vario",25_000_000,"N 2939 NT");
        System.out.println("Sepeda " + sepeda1);
        Sepeda sepeda2 = new Sepeda("Yamaha","Jupiter",20_000_000,"P 8430 HT");
        System.out.println("Sepeda " + sepeda2);


    }
}
