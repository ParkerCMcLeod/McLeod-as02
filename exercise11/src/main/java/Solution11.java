
/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Parker McLeod
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Solution11 {
    public static void main(String[] args) {
        /*
        Prompt user for number of euros exchanging 'numEuros'.
        Prompt user for exchange rate 'exchangeRate'.
        Print numEuros at exchangeRate rounded up to nearest penny.
         */
        System.out.print("How many euros are you exchanging? ");
        Scanner scanner = new Scanner(System.in);
        double numEuros = scanner.nextDouble();
        System.out.print("What is the exchange rate? ");
        double exchangeRate = scanner.nextDouble();
        DecimalFormat ft = new DecimalFormat("#");
        System.out.println(ft.format(numEuros) + " euros at an exchange rate of " + exchangeRate + " is");
        ft = new DecimalFormat("0.00");
        System.out.print(ft.format(Math.ceil(numEuros * exchangeRate * 100.0) / 100.0) + " U.S. dollars.");
    }
}
