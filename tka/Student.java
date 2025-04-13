package com.tka;

public class Student {
    int studID;
    String studName;
    String course;
    double Percentage;

    public Student(int studID, String studName, String course, double percentage) {
        this.studID = studID;
        this.studName = studName;
        this.course = course;
        Percentage = percentage;
    }

    public void studentDetail()
    {
        System.out.println("Student ID = "+studID);
        System.out.println("Student Name = "+studName);
        System.out.println("Student course = "+course);
        System.out.println("Student Percentage = "+Percentage);
        System.out.println("Student Grade = "+ calculateGrade());
    }

    public String calculateGrade()
    {
        if(Percentage <= 100 && Percentage >= 90) {
            return "A";
        }else if(Percentage <= 89 && Percentage >= 80) {
            return "B";
        }else if(Percentage <= 79 && Percentage >= 70) {
            return "C";
        }else if(Percentage <= 69 && Percentage >= 60){
            return "D";
        }else if(Percentage <= 59 && Percentage >= 50) {
            return "E";
        }else {
            return "F";
        }

    }




}
