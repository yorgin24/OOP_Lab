package com.company;

public class Main {

    public static void main(String[] args) {
	    // objek class tabung
        Tabung satu = new Tabung(5,10);
        Tabung dua = new Tabung(7.5,15.5);

        // Tampilkan objek 1
        System.out.println("Tabung Pertama");
        System.out.println("Radius = " + satu.radius);
        System.out.println("Tinggi = " + satu.tinggi);
        System.out.println("Luas alas = " + satu.getLuasAlas());
        System.out.println("Volume tabung = " + satu.getVolume());

        //Tampilkan objek 2
        System.out.println("\nTabung Kedua");
        System.out.println("Radius = " + dua.radius);
        System.out.println("Tinggi = " + dua.tinggi);
        System.out.println("Luas alas = " + dua.getLuasAlas());
        System.out.println("Volume tabung = " + dua.getVolume());
    }
}
