package mainorang;

import orangmodel.GuruModel;
import orangmodel.MuridModel;

public class MainMurid {
    public static void main(String[] args) {
        GuruModel guru1 = new GuruModel("B.Indonesia","Pak Roni",30);
        System.out.println(guru1);

        MuridModel murid1 = new MuridModel("B.Inggris","Bu Nurita",22,12);
        System.out.println(murid1);

    }
}
