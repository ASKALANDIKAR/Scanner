// By Default java.lang package is imported in .java file
// Scanner Class is in-built class of java.unit package



package com.tka;

import java.util.Scanner;

public class Demo
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter integer value");
        int a = sc.nextInt();

        System.out.println("Enter Double value");
        double b = sc.nextDouble();

        System.out.println("Enter Byte Value");
        byte c = sc.nextByte();

        System.out.println("Enter Short value");
        short d = sc.nextShort();

        System.out.println("Enter Long value");
        long e = sc.nextLong();

        System.out.println("Enter Char value");
        char f = sc.next().charAt(0);

        System.out.println("Enter Boolean Value");
        boolean t = sc.nextBoolean();

        System.out.println("Integer " + a);
        System.out.println("Double " + b);
        System.out.println("Byte " + c);
        System.out.println("Short " + d);
        System.out.println("Long " + e);
        System.out.println("Char " + f);
        System.out.println("Boolean " + t);

    }

}
