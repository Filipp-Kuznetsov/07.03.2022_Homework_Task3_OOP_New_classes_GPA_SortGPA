package com.company;

public class Main {

    public static void main(String[] args) {
        Students students = new Students();
	students.names= new String[]{ "Nick", "Ivan", "Antonio","Jack"};
    students.notes= new int[][]{{2,5,5,5,4,3},{4,4,3,3,3},{5,5,5,5,2,2},{5,5,5,4}};
    int maxIndex= students.findBestStudent(students.notes, students.names);

        System.out.println(students.names[0]+" "+students.findBestGPA(students.notes[0]));
        System.out.println(students.names[1]+" "+students.findBestGPA(students.notes[1]));
        System.out.println(students.names[2]+" "+students.findBestGPA(students.notes[2]));
        System.out.println(students.names[3]+" "+students.findBestGPA(students.notes[3]));
        System.out.println(students.names[maxIndex]+" "+students.findBestGPA(students.notes[maxIndex]));



    }
}
