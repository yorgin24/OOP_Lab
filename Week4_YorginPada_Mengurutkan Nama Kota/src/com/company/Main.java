package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner baca = new Scanner(System.in);
        int JumlahKota;

        System.out.print("banyak kota yang akan diurutkan adalah : ");
        JumlahKota = baca.nextInt();

        String[] NamaKota = new String[JumlahKota];
        for (int temp = 0;temp < JumlahKota; temp++){
            System.out.print("Nama Kota ke " + (temp+1) + " adalah : ");
            NamaKota[temp] = baca.next();
        }

        for (int i = 0; i <JumlahKota; ++i) {
            for (int j = i + 1; j < JumlahKota; ++j) {
                if (NamaKota[i].compareTo(NamaKota[j]) > 0) {
                    String temp = NamaKota[i];
                    NamaKota[i] = NamaKota[j];
                    NamaKota[j] = temp;
                }
            }
        }

        System.out.println("\nUrutan sesuai alfabet dari nama kota yang diinput adalah:");
        for (int temp =0 ;temp < JumlahKota; temp++){
            System.out.println(NamaKota[temp]);
        }
    }
}
