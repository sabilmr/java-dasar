package com.bootcamp.oop.model;

public class Categori {

    public Integer id;
    public String code;
    public String name;

    public Categori(){

    }
    public Categori(Integer vid, String vcode, String vname){
        id = vid;
        code = vcode;
        name = vname;
    }
    @Override
    public String toString() {
        return "Categori{" +
                "id=" + id +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
