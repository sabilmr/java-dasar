package model;

public class Sepeda extends Kendaraan{
    private String harga;

    public Sepeda(String namaBrend, String tipeKendaraan, String jenisKendaraan, String harga) {
        super(namaBrend, tipeKendaraan, jenisKendaraan);
        this.harga = harga;
    }

    @Override
    public String toString() {
        return "Sepeda{"+
                "namaBrend='" + this.getNamaBrend() + '\'' +
                ", tipeKendaraan='" + this.getTipeKendaraan() + '\'' +
                ", jenisKendaraan='" + this.getJenisKendaraan() + '\'' +
                ", harga='" + harga + '\'' +
                '}';
    }
}

