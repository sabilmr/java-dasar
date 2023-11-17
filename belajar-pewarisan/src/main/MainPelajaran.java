package main;

import model.Guru;
import model.Pelajaran;

public class MainPelajaran {
    public static void main(String[] args) {

        Pelajaran pelajaran1 = new Pelajaran("Senin,Tanggal 18 Juni 2023","Upacara");
        System.out.println(pelajaran1);
        Guru guru1 = new Guru("Senin","Matematika","Bu Nita","Di Kelas 8D","08.00 WIB - 09.00 WIB");
        System.out.println(guru1);

        Pelajaran pelajaran2 = new Pelajaran("Selasa,Tanggal 19 Juni 2023","B.Indonesia");
        System.out.println(pelajaran2);
        Guru guru2 = new Guru("Selasa","B.Inggris","Bu Rosia","Di Kelas 8E","09.00 WIB - 10.00 WIB");
        System.out.println(guru2);

        Pelajaran pelajaran3 = new Pelajaran("Rabu,Tanggal 20 Juni 2023","B.Jawa");
        System.out.println(pelajaran3);
        Guru guru3 = new Guru("Rabu","Teknik Permesinan","Pak Ganjar","Di Kelas 8F","10.00 WIB - 11.00 WIB");
        System.out.println(guru3);

        Pelajaran pelajaran4 = new Pelajaran("Kamis,Tanggal 21 Juni 2023","Aqidah");
        System.out.println(pelajaran4);
        Guru guru4 = new Guru("Kamis","Pjok","Pak Bambang","Di Kelas 8G","11.00 WIB - 12.00 WIB");
        System.out.println(guru4);

        Pelajaran pelajaran5 = new Pelajaran("Jum'at","Bubut");
        System.out.println(pelajaran5);
        Guru guru5 = new Guru("Jum'at","Aswaja","Pak Budi","Di Kelas 9C","07.00 WIB - 08.00 WIB");
        System.out.println(guru5);

        Pelajaran pelajaran6 = new Pelajaran("Sabtu","Sejarah Indonesia");
        System.out.println(pelajaran6);
        Guru guru6 = new Guru("Sabutu","PKN","Bu Indah","Di kelas 9D","08.00 WIB - 09.00 WIB");
        System.out.println(guru6);
    }
}
