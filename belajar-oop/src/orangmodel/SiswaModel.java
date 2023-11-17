package orangmodel;

public class SiswaModel extends OrangModel{
    private String kelas;

    public SiswaModel(int id, String nama, String alamat, String jk, String kelas) {
        super(id, nama, alamat, jk);
        this.kelas = kelas;
    }

   @Override
    public String toString() {
        return "id=" + this.getId() +
                ", nama='" + this.getNama() + '\'' +
                ", alamat='" + this.getAlamat() + '\'' +
                ", jk='" + this.getJk() + '\'' +
                ", kelas='" + kelas + '\'' +
                '}';
    }

}

