package orangmodel;

public class Kendaraan {
    private String namaBrend;
    private String namaTipe;
    private Integer harga;

    public String getNamaBrend() {
        return namaBrend;
    }

    public String getNamaTipe() {
        return namaTipe;
    }


    public Integer getHarga() {
        return harga;
    }



    @Override
    public String toString() {
        return "Kendaraan{" +
                "namaBrend='" + namaBrend + '\'' +
                ", namaTipe='" + namaTipe + '\'' +
                ", harga=" + harga +
                '}';
    }

    public Kendaraan(String namaBrend, String namaTipe, Integer harga) {
        this.namaBrend = namaBrend;
        this.namaTipe = namaTipe;
        this.harga = harga;
    }
}
