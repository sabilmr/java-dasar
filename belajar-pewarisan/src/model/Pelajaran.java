package model;

public class Pelajaran {
    private String hari;
    private String mapel;
    private final String sekolah = "SMK TEKSTIL PANDAAN";

    public String getHari() {
        return hari;
    }

    public String getMapel() {
        return mapel;
    }

    public Pelajaran(String hari, String mapel) {
        this.hari = hari;
        this.mapel = mapel;
    }

    @Override
    public String toString() {
        return "Pelajaran{" +
                "hari='" + hari + '\'' +
                ", mapel='" + mapel + '\'' +
                ", sekolah='" + sekolah + '\'' +
                '}';
    }
}