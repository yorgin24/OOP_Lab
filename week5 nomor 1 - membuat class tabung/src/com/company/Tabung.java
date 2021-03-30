package com.company;

public class Tabung {
    //deklarasi variabel di class tabung
    double radius, tinggi;

    //constructor memuat objek tabung tanpa parameter (nilai default)
    public Tabung(){
        radius = 1;
        tinggi = 1;
    }

    //constructor memuat objek tabung dengan parameter (nilai bebas dtentukan user)
    public Tabung (double r, double t){
        radius = r;
        tinggi = t;
    }

    //method untuk mendapatkan volume tabung
    public double getVolume() {
       double volume;
       volume = Math.PI * Math.pow(radius,2) * tinggi;
       return volume;
    }

    //method untuk mendapatkan luas tabung
    public double getLuasAlas(){
        double luasAlas;
        luasAlas = Math.PI * Math.pow(radius, 2);
        return luasAlas;
    }

    //method untuk memodifikasi radius
    public void serRadius(double r){
        radius = r;
    }

    //method untuk memodifikasi tinggi
    public void setTinggi(double t){
        tinggi = t;
    }
}
