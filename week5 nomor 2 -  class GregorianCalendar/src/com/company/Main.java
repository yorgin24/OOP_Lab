package com.company;

import java.util.GregorianCalendar;

public class Main {

    public static void main(String[] args) {

        //create object
        GregorianCalendar calendar = new GregorianCalendar();

        //string ini untuk mengubah default month menjadi char nama bulan
        final String[] Month = { //pakai final supaya class tersebut tidak bisa diwariskan
                "Januari", "Februari", "Maret",
                "April", "Mei", "Juni",
                "Juli", "Agustus", "September",
                "Oktober", "November", "Desember"
        };

        //menampilkan tanggal, bulan, tahun saat ini
        System.out.println("Tanggal hari ini adalah : " + calendar.get(GregorianCalendar.DAY_OF_MONTH) + " " + Month[calendar.get(GregorianCalendar.MONTH)] + " " + calendar.get(GregorianCalendar.YEAR));

        //menampilkan waktu yang telah terlewati sejak 1 januari 1970
        long milisecond = calendar.getTimeInMillis();
        long detik = milisecond/1000;
        long jam = detik/3600;
        long hari = jam/24;
        long bulan = hari/30;
        long tahun = bulan/12;

        System.out.println("Waktu yang telah terlewati sejak 1 januari 1970 adalah " + tahun + " Tahun " + bulan + " Bulan " + hari + " Hari");


    }
}
