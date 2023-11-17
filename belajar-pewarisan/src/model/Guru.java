package model;

public class Guru extends Pelajaran {

    private String nama;
    private String mengajar;
    private String jam;

    public Guru(String hari, String mapel, String nama, String mengajar, String jam) {
        super(hari, mapel);
        this.nama = nama;
        this.mengajar = mengajar;
        this.jam = jam;
    }

    @Override
    public String toString() {
        return "Guru{" +
                "hari='" + this.getHari() + '\'' +
                ", mapel='" + this.getMapel() + '\'' +
                ", nama='" + nama + '\'' +
                ", mengajar='" + mengajar + '\'' +
                ", jam='" + jam + '\'' +
                '}';
    }
}
