package orangmodel;

public class MuridModel extends GuruModel{
private Integer absen;

    public MuridModel(String mapel, String nama, Integer umur, Integer absen) {
        super(mapel, nama, umur);
        this.absen = absen;
    }

    @Override
    public String toString() {
        return"mapel='" + this.getMapel() + '\'' +
                ", nama='" + this.getNama() + '\'' +
                ", umur=" + this.getUmur() +
                ", absen=" + absen +
                '}';
    }
}
