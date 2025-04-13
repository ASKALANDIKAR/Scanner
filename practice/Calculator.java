
//      Input two numbers.
//      Perform +, -, *, / operations using methods.
//      Ask user which operation to perform.


package com.practice;

import java.util.Scanner;

public class Calculator
{
    public static void add(double a, double b)
    {
        double c =a+b;
        System.out.println("You have selected Addition");
        System.out.println("Addition: "+a+" + "+b+"  "+c );
    }

    public static void sub(double a, double b)
    {
        double c =a-b;
        System.out.println("You have selected Subtraction");
        System.out.println("Subtraction: "+a+" - "+b+"  "+c );
    }
    public static void multi(double a, double b)
    {
        double c =a*b;
        System.out.println("You have selected Multiplication");
        System.out.println("Multiplication: "+a+" * "+b+"  "+c );
    }

    public static void div(double a, double b) {
        if (b == 0) {
            System.out.println("ERROR: Division By Zero is not Possible...");
        }
        else {
            double c =a/b;
            System.out.println("You have selected Division");
            System.out.println("Division: "+a+" / "+b+"  "+c );
        }
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.println("Please Enter any two Numbers");
        System.out.println("Your First Number:");
        double n1=sc.nextDouble();
        System.out.println("Your Second Number: ");
        double n2 =sc.nextDouble();

        System.out.println("Choose an Operation to Perform: (+, - , * , /)");
        String s1 = sc.next();

        switch (s1){
            case "+" :
                add(n1,n2);
                break;
            case "-" :
                sub(n1,n2);
                break;
            case "*":
                multi(n1,n2);
                break;
            case "/":
                div(n1,n2);
                break;
            default:
                throw new IllegalStateException("Unexpected value: " + s1);
        }



    }

}















