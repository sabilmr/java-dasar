package orangmodel;

public class Sepeda extends Kendaraan {
    private String platnomor;


    public Sepeda(String namaBrend, String namaTipe, Integer harga, String platnomor) {
        super(namaBrend, namaTipe, harga);
        this.platnomor = platnomor;
    }

    @Override
    public String toString() {
        return  "namaBrend='" + this.getNamaBrend() + '\'' +
                ", namaTipe='" + this.getNamaTipe() + '\'' +
                ", harga=" + this.getHarga() +
                ", platnomor ='" + platnomor + '\'' +
                '}';
    }
}
