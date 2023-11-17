package model1;

public class Murid {
    public String nama;
    public Integer absen;
    public Integer kelas;

    public Murid(String Nama, Integer Absen, Integer Kelas){
       nama  = Nama;
       absen = Absen;
       kelas = Kelas;
    }

    @Override
    public String toString() {
        return "Murid{" +
                "nama='" + nama + '\'' +
                ", absen=" + absen +
                ", kelas=" + kelas +
                '}';
    }
}
