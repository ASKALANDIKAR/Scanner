package com.practice;

public class BankAccount {

    String  holderName;
    double balance;


    public BankAccount(String holderName, double balance){
        this.holderName=holderName;
        this.balance=balance;
    }

    public void deposit(double amount){
        if(amount>0){
            System.out.println("\nYour Depositing amount: "+amount+", in your current balance :₹"+balance);
            this.balance = balance+amount;
            System.out.println("Your Current Balance is: ₹"+this.balance);
        }
        else {
            System.out.println("Invalid Amount....");
        }
    }

    public void withdraw(double amount){
        if(amount<=balance && amount >=0){
            this.balance=balance-amount;
            System.out.println("\nYour Withdrawal Amount: ₹"+amount);
            System.out.println("Amount Withdrawal Successfully :)");
            System.out.println("Current Balance: ₹"+ this.balance);
        }
        else if(amount>balance) {
            System.out.println("Insufficient Balance :( ");
            System.out.println("Current Balance: ₹"+ this.balance);
        }
        else {
            System.out.println("Withdrawal UnSuccessfully :(" );
        }

    }

    public void balance(){
        System.out.println("Current Balance is: ₹"+this.balance);
    }


}
