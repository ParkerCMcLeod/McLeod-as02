/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Parker McLeod
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Solution12 {
    public static void main(String[] args) {
        /*
        Prompt for principal 'principal'.
        Prompt for rate of interest 'interestRate'.
        Promp for 'numYears'.
        Calculate 'investmentAmound'.
        Print after numYear at interestRate, the investment will be worth 'investmentAmount'
         */
        System.out.print("Enter the principal: ");
        Scanner scanner = new Scanner(System.in);
        double principal = scanner.nextDouble();
        System.out.print("Enter the rate of interest: ");
        double interestRate = scanner.nextDouble();
        System.out.print("Eneter the number of years: ");
        double numYears = scanner.nextDouble();
        DecimalFormat ft = new DecimalFormat("####");
        System.out.print("After " + ft.format(numYears) + " years at " + interestRate + "%, the investment will be worth $" + ft.format(Math.ceil(principal * (1 + (interestRate/100)*numYears) * 100) / 100));
    }
}
