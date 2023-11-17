package mainorang;

import model1.Guru;
import orangmodel.OrangModel;
import orangmodel.SiswaModel;

public class MainSiswa {
    public static void main(String[] args) {

        SiswaModel siswa1 = new SiswaModel(1,"Sabil","Surabaya","Pria","2B");
        System.out.println("data siswa "+ siswa1);

        OrangModel orang1 = new OrangModel(3,"Bayu","Pamarican","Pria");
        System.out.println(orang1);


    }
}
