/*
 *  UCF COP3330 Summer 2021 Assignment 1 Exercise 13 Solution
 *  Copyright 2021 Theodore Linardic
 */

package oop.ex13;
import java.util.Scanner;

public class ex13 {
    public static void main( String[] args )
    {
        Scanner userInputScanner = new Scanner(System.in);

        System.out.print("What is the principal amount? ");
        double principal = userInputScanner.nextDouble();
        System.out.print("What is the rate? ");
        double rate = userInputScanner.nextDouble();
        double correctRate = rate/100;
        System.out.print("What is the number of years? ");
        int years = userInputScanner.nextInt();
        System.out.print("What is the humber of times the interest is compounded per year? ");
        int compoundTimes = userInputScanner.nextInt();

        double amount = principal * (Math.pow((1+correctRate/compoundTimes),(compoundTimes*years)));
        String finalAmount = String.format("$%.2f",amount);
        String principalFormatted = String.format("$%.2f", principal);

        System.out.println(principalFormatted + " invested at " + rate + "% for " + years + " years compounded " + compoundTimes + " per year is " + finalAmount);
    }

}
