/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Parker McLeod
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Solution20 {
    public static void main(String[] args) {
        /*
        Prompt user for order amount double 'amount'.
        Prompt user for String 'state'.
        Prompt user for country Sting 'county'.
        Print double 'tax' based on county.
        Print double 'total'.
         */
        System.out.print("What is the order amount? ");
        Scanner scanner = new Scanner(System.in);
        double amount = Double.parseDouble(scanner.nextLine());
        System.out.print("What state do you live in? ");
        String state = scanner.nextLine();
        System.out.print("What county do you live in? ");
        String county = scanner.nextLine();
        double tax = 0.0;
        if (state.equals("Wisconsin")) {
            if (county.equals("Eau Claire")) {
                tax = 5.5;
            } else if (county.equals("Dunn")) {
                tax = 5.4;
            } else {
                tax = 5.0;
            }
        }
        DecimalFormat ft = new DecimalFormat("0.00");
        System.out.println("The tax is $" + ft.format(Math.ceil(amount * (tax / 100) * 100) / 100) + ".\n"
        + "The total is $" + ft.format(amount + Math.ceil(amount * (tax / 100) * 100) / 100));
    }
}
