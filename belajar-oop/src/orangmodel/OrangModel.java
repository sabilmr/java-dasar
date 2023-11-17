package orangmodel;

public class OrangModel {
    private int id;
    private String nama;
    private String alamat;
    private String jk;

    public int getId() {
        return id;
    }

    public String getNama() {
        return nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public String getJk() {
        return jk;
    }

    public OrangModel(int id, String nama, String alamat, String jk){
       this.id = id;
       this.nama = nama;
       this.alamat = alamat;
       this.jk = jk;
    }

   @Override
    public String toString() {
        return "OrangModel{" +
                "id=" + id +
                ", nama='" + nama + '\'' +
                ", alamat='" + alamat + '\'' +
                ", jk='" + jk + '\'' +
                '}';
    }
}
