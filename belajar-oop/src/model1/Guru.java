package model1;

public class Guru {
    public String nama;
    public String jk;
    public Integer umur;
    public String alamat;

    public Guru(String Nama, String Jk, Integer Umur,String Alamat){
        nama = Nama;
        jk = Jk;
        umur = Umur;
        alamat = Alamat;
    }

    @Override
    public String toString() {
        return "Guru{" +
                "nama='" + nama + '\'' +
                ", jk='" + jk + '\'' +
                ", umur=" + umur +
                ", alamat='" + alamat + '\'' +
                '}';
    }
}
