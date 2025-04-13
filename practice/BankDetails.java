package com.practice;

import java.util.Scanner;

public class BankDetails {
    public static void main(String[] args) {
        System.out.println("-----------WELCOME-----------");
        System.out.println("Enter Account Holder Name: ");
        Scanner sc = new Scanner(System.in);
         String name = sc.nextLine();

        System.out.println("Enter Your Initial Balance: ");
        double inBalance = sc.nextDouble();

        System.out.println("\n\nYour Bank Detail's.....");
        System.out.println("Account Holder Name: "+ name);
        System.out.println("Initial Balance: ₹"+ inBalance);

        BankAccount acc = new BankAccount("Holder Name" , inBalance);

        int choice ; {
            System.out.println(" #1.  Deposit");
            System.out.println(" #2.  Withdrawal");
            System.out.println(" #3.  Check Balance");
            choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter Your Depositing Amount: ");
                    double amount = sc.nextDouble();
                    acc.deposit(amount);
                    break;
                case 2:
                    System.out.println("Enter your Withdrawal Amount :");
                    double amount1 = sc.nextDouble();
                    acc.withdraw(amount1);
                    break;

                case 3:
                    acc.balance();
                    break;


                default:
                    System.out.println("Enter Your Choice between 1 to 3 ");
                    break;
            }

        }

    }
}
