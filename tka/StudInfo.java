package com.tka;

import java.util.Scanner;

public class StudInfo {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Your Roll No.: ");
        int rollno= sc.nextInt();
        sc.nextLine();

        System.out.println("Enter Your Name: ");
        String name = sc.nextLine();

        System.out.println("Enter Your Course: ");
        String course = sc.next();

        System.out.println("Enter Your Percentage: ");
        double percent= sc.nextDouble();

        Student s1=new Student(rollno,name,course,percent);

        s1.studentDetail();
    }
}
