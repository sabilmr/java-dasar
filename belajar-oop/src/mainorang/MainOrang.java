package mainorang;

import orangmodel.OrangModel;

public class MainOrang {
    public static void main(String[] args) {
        OrangModel orang1 = new OrangModel(1,"Budi","Pamarican","Pria");
        System.out.println(orang1);

        OrangModel orang2 = new OrangModel(2,"Sabil","Surabaya","Pria");
        System.out.println(orang2);

        OrangModel orang3 = new OrangModel(3,"Wanto","Pandaan","Pria");
        System.out.println(orang3);
    }
}
