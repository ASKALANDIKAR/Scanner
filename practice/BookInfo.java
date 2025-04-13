//Calling Book.java in this file


package com.practice;

import java.util.Scanner;

public class BookInfo {

    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("Enter Your Book Title: ");
        String name = sc.nextLine();
        System.out.println("Enter Book's Author: ");
        String author = sc.nextLine();
        System.out.println("Enter Book's Price: ");
        double price= sc.nextDouble();

        Books b1 =new Books(name,author,price);
        System.out.println("\n------Your Book's Details------");
        b1.bookDetails();

    }
}
