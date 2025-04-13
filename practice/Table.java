package com.practice;


import java.util.Scanner;

public class Table {
  public void m(){
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter Table Number: ");
      int a= sc.nextInt();
      for(int i=1; i<=10; i++){
          System.out.println(a + " x "+ i + " = "+ a*i);
      }
  }
    
}
