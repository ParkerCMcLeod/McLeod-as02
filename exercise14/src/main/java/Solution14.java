/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Parker McLeod
 */


import java.text.DecimalFormat;
import java.util.Scanner;

public class Solution14 {
    public static void main(String[] args) {
        /*
        Prompt user for order amount double 'amount'.
        Prompt user for state string 'state'.
        Primp user for double 'subtotal'.
        Promp user for tax if in WI 'tax'.
        Print total to screen.
         */
        System.out.print("What is the order amount? ");
        Scanner scanner = new Scanner(System.in);
        double amount = scanner.nextDouble();
        System.out.print("What is the state? ");
        String kill = scanner.nextLine();
        String state = scanner.nextLine();
        double tax = 0.0;
        if (state.equals("WI")) {
            tax = 5.5;
        }
        DecimalFormat ft = new DecimalFormat("0.00");
        System.out.println("The subtotal is $" + ft.format(amount) + ".");
        System.out.println("The tax is $" + ft.format(Math.ceil((amount * (tax / 100)) * 100) / 100) + ".");
        System.out.println("The total is $" + ft.format(Math.ceil((amount + amount * (tax/100)) * 100) /100 ) + ".");

    }
}
