package model1;

public class Pelajaran {
    String mapel;
    Integer code;
    String guru;

    public Pelajaran(String Mapel, Integer Code,String Guru){
        mapel = Mapel;
        code = Code;
        guru = Guru;
    }

    @Override
    public String toString() {
        return "Pelajaran{" +
                "mapel='" + mapel + '\'' +
                ", code=" + code +
                ", guru='" + guru + '\'' +
                '}';
    }
}
