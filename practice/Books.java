
//Input book title, author, price.
//   Use constructor to initialize.
//   Display book details using a method


package com.practice;

public class Books {
    String title, author;
    double price;

    public Books(String title, String author, double price)
    {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public void bookDetails()
    {
        System.out.println("Book Title: "+ title);
        System.out.println("Book Author: "+ author);
        System.out.println("Book Price: "+ price);
    }
}
