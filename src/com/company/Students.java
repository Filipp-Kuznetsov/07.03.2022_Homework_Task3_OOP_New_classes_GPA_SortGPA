package com.company;

public class Students {

     String [] names;
     int [][] notes;
     public int findBestStudent(int [][] notes, String[] names){
          double maxGPAStudents = findBestGPA(notes[0]);
          int maxIndex=0;
          for (int i =0;i<notes.length;i++){
               double gpa= findBestGPA(notes[i]);
               if (gpa>maxGPAStudents){
                    maxGPAStudents= gpa;
                    maxIndex=i;
               }
          }
          return maxIndex;
     }

     public double findBestGPA(int[] notes){
          double sum =0;

          for (int i =0;i<notes.length;i++){
               sum += notes[i];

          }
          return sum/notes.length;
     }




}


