
//   Take student name, roll number, and marks for 3 subjects.
//   Calculate total and average.
//   Display grade (A/B/C/Fail) using if-else logic.

package com.practice;

import java.util.Scanner;

public class Student {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Student Name: ");
        String s1 =sc.nextLine();

        System.out.println("Enter Student Roll Number: ");
        int n1 = sc.nextInt();

        System.out.println("Enter Student Physics Marks: ");
        int m1 = sc.nextInt();

        System.out.println("Enter Student Chemistry Marks: ");
        int m2 = sc.nextInt();

        System.out.println("Enter Student Maths Marks: ");
        int m3 = sc.nextInt();


        int avg = m1+m2+m3/3;

        String g;
        if(avg>=75){
            g=("Grade: A");
        }
        else if (avg>=60) {
            g= ("Grade: B");
        }
        else if (avg>=40)
        {
            g= ("Grade: C");

        }
        else {
            g=("Grade: F");
        }

        System.out.println("\n ----------Student Report----------");
        System.out.println("Name :" + s1);
        System.out.println("RollNo.: "+ n1);
        System.out.println("Total Marks: "+ avg+"/300");
        System.out.println("Grade :"+ g);

    }
}
