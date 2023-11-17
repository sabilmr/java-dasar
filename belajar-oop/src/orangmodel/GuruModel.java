package orangmodel;

public class GuruModel {
    private String mapel;
    private String nama;
    private Integer umur;

    public String getMapel() {
        return mapel;
    }

    public String getNama() {
        return nama;
    }

    public Integer getUmur() {
        return umur;
    }

    public GuruModel(String mapel, String nama, Integer umur) {
        this.mapel = mapel;
        this.nama = nama;
        this.umur = umur;
    }

    @Override
    public String toString() {
        return "GuruModel{" +
                "mapel='" + mapel + '\'' +
                ", nama='" + nama + '\'' +
                ", umur=" + umur +
                '}';
    }
}
