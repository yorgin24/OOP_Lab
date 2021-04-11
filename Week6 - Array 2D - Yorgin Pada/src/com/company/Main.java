package com.company;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        char[] kunci_jawaban = {'D', 'B', 'D', 'C', 'C', 'D', 'A', 'E', 'A', 'D'};

        char[][] Mhs = {
                {'A', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'D', 'B', 'A', 'B', 'C', 'A', 'E', 'E', 'A', 'D'},
                {'E', 'D', 'D', 'A', 'C', 'B', 'E', 'E', 'A', 'D'},
                {'C', 'B', 'A', 'E', 'D', 'C', 'E', 'E', 'A', 'D'},
                {'A', 'B', 'D', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'B', 'B', 'A', 'C', 'C', 'D', 'E', 'E', 'A', 'D'},
                {'E', 'B', 'E', 'C', 'C', 'D', 'E', 'E', 'A', 'D'}
        };
        System.out.println("Kunci Jawaban       = " + Arrays.toString(kunci_jawaban) + "\n");
        compareArray(Mhs, kunci_jawaban);

    }

    //method to compare Array and return jumlah benar
    private static void compareArray(char[][] dataArray, char[] kj) {
        int baris = dataArray.length;
        int kolom = dataArray[0].length;

        for (int i = 0; i < baris; i++) {
            int counter = 0;
            for (int j = 0; j < kolom; j++) {
                if (dataArray[i][j] == kj[j]) {
                    counter++;
                }
            }
            System.out.println("Jawaban Mahasiswa " + i + " = " + Arrays.toString(dataArray[i]));
            System.out.print("Jawaban benar Mhs " + i + " = " + counter);
            System.out.println("\n");
        }


    }
}