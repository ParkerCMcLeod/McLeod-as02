/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Parker McLeod
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Solution13 {
    public static void main(String[] args) {
        /*
        Prompt for 'principal'.
        Prompt for 'rate'.
        Prompt for 'numYears'.
        Prompt for 'numTimesCompoundedPerYear'.
        Calculate 'result' = P(1 + r/n)^(n*t).
        Print $'principal' invest at 'rate' for 'numYears' compounded 'numTimesCompoundedPerYear' times per year is
        $result.
         */
        System.out.print("What is the principal amount? ");
        Scanner scanner = new Scanner(System.in);
        double principal = scanner.nextDouble();
        System.out.print("What is the rate? ");
        double rate = scanner.nextDouble();
        System.out.print("What is the number of years? ");
        int numYears = scanner.nextInt();
        System.out.print("What is the number of times the interest is compounded per year? ");
        int numTimesCompoundedPerYear = scanner.nextInt();
        DecimalFormat ft = new DecimalFormat("####");
        System.out.print("$" + ft.format(principal) + " invested at " + rate + "% for " + numYears + " years compounded "
         + numTimesCompoundedPerYear + " times per year is $");
        ft = new DecimalFormat("#.00");
        System.out.print(Math.ceil(principal * (Math.pow((1 + (rate/100)/numTimesCompoundedPerYear),numTimesCompoundedPerYear * numYears)) * 100) / 100);


    }
}
