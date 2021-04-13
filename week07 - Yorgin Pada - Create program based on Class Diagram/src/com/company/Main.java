package com.company;

import java.util.ArrayList;

class TesCourse {

    public static void main(String[] args) {
	    Course course1 = new Course("Course 1");
	    Course course2 = new Course ("Course 2");

	    //menambah student ke dalam course1 dan course2
        course1.addStudent("Peter Jones");
        course1.addStudent("Kim Smith");
        course1.addStudent("Anne Kennedy");

        course2.addStudent("Peter Jones");
        course2.addStudent("Steve Smith");

        //print nama students + jumlah students di tiap course

        System.out.println("Print nama students + jumlah students di tiap course sebelum drop");

        System.out.println("\nNumber of student in course 1 : " + course1.getNumberOfStudents());
        for(int i=0; i< course1.getNumberOfStudents(); i++){
            System.out.print(course1.getStudents().get(i)+", ");
        }

        System.out.println("\nNumber of student in course 2 : " + course2.getNumberOfStudents());
        for(int i=0; i< course2.getNumberOfStudents(); i++){
            System.out.print(course2.getStudents().get(i)+", ");
        }

        //menghapus Peter Jones dari course1

        course1.dropStudent("Peter Jones");

        //print nama students + jumlah students di tiap course

        System.out.println("\n\nPrint nama students + jumlah students di tiap course setelah drop 'Peter Jones' dari course1");
        System.out.println("\nDrop students: 'Peter Jones' dari course1");

        System.out.println("\nNumber of student in course 1 : " + course1.getNumberOfStudents());
        for(int i=0; i< course1.getNumberOfStudents(); i++){
            System.out.print(course1.getStudents().get(i)+", ");
        }

        System.out.println("\nNumber of student in course 2 : " + course2.getNumberOfStudents());
        for(int i=0; i< course2.getNumberOfStudents(); i++){
            System.out.print(course2.getStudents().get(i)+", ");
        }

    }
}
