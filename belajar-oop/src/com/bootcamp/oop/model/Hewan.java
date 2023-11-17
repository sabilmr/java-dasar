package com.bootcamp.oop.model;

public class Hewan {
   public String nama;
   public Integer kaki;
   public String makanan;
   public String beranak;

   @Override
   public String toString() {
      return "Hewan{" +
              "nama='" + nama + '\'' +
              ", kaki=" + kaki +
              ", makanan='" + makanan + '\'' +
              ", beranak='" + beranak + '\'' +
              '}';
   }
}
