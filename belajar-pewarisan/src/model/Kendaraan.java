package model;

public class Kendaraan {
    private String namaBrend;
    private String tipeKendaraan;
    private String jenisKendaraan;


    public String getNamaBrend() {
        return namaBrend;
    }

    public String getTipeKendaraan() {
        return tipeKendaraan;
    }

    public String getJenisKendaraan() {
        return jenisKendaraan;
    }

    public Kendaraan(String namaBrend, String tipeKendaraan, String jenisKendaraan) {
        this.namaBrend = namaBrend;
        this.tipeKendaraan = tipeKendaraan;
        this.jenisKendaraan = jenisKendaraan;
    }

    @Override
    public String toString() {
        return "Kendaraan{" +
                "namaBrend='" + namaBrend + '\'' +
                ", tipeKendaraan='" + tipeKendaraan + '\'' +
                ", jenisKendaraan='" + jenisKendaraan + '\'' +
                '}';
    }
}
