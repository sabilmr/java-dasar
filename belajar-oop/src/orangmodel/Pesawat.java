package orangmodel;

public class Pesawat extends Kendaraan{

    private String pilot;
    private String tujuanPenerbangan;

    public Pesawat(String namaBrend, String namaTipe, Integer harga, String pilot, String tujuanPenerbangan) {
        super(namaBrend, namaTipe, harga);
        this.pilot = pilot;
        this.tujuanPenerbangan = tujuanPenerbangan;
    }

        @Override
        public String toString () {
            return "namaBrend='" + this.getNamaBrend() + '\'' +
                    ", namaTipe='" + this.getNamaTipe() + '\'' +
                    ", harga=" + this.getHarga() +
                    ", pilot='" + pilot + '\'' +
                    ", tujuanPenerbangan='" + tujuanPenerbangan + '\'' +
                    '}';
    }
}

