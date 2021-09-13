/*
 *  UCF COP3330 Fall 2021 Assignment 11 Solution
 *  Copyright 2021 Nick Cook
 */


import java.util.Scanner;

public class E11 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        double result = 0.0;

        System.out.println("Welcome to the Currency Converter");
        System.out.println("----------------------------------");
        System.out.println("How many Euros are you exchanging?");
        double euros = scan.nextDouble();

        System.out.println("What is the exchange rate?");
        double exchangeRate = scan.nextDouble();
        result = euros * exchangeRate;

        System.out.println(euros + " Euros at an Exchange rate of " + exchangeRate + " is ");
        System.out.println(result + " U.S Dollars ");

            }
}

