package com.company;

import java.util.ArrayList;

class Course {

    //instance fields
    private String courseName; // nama course
    private ArrayList students = new ArrayList();// array untuk menyimpan nama student untuk suatu course, pakai Arraylist agar lebih mudah dalam manipulasi.
    private int numberOfStudents = 0; //

    //constructor untuk nama kursus
    public Course(String courseName){
        this.courseName = courseName;
    }

    //method untuk me-return nama kursus
    public String getCourseName(){
        return courseName;
    }

    //method untuk menambahkan siswa baru(nama)
    public void addStudent(String student){
        students.add(student); //menambahkan data nama siswa baru ke ArrayList students
        numberOfStudents++; // nemambah data jumlah students
    }

    //method untuk menghapus siswa(nama) dari array
    public void dropStudent(String student){
        for(int i=0; i<numberOfStudents; i++){
            if(students.get(i).equals(student)){
                students.remove(i);
                numberOfStudents--;
                break;
            }
        }
    }

    //me-return nama student
    public ArrayList getStudents(){
        return students;
    }

    //mer-return jumlah siswa dalam suatu kursus.
    public int getNumberOfStudents(){
        return numberOfStudents;
    }

}
