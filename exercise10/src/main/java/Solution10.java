/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Parker McLeod
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Solution10 {
    public static void main(String[] args) {
        /*
        Prompt user for price of item 1 'item1Price'.
        Prompt user for quantity of item 1 'item1Num'.
        Prompt user for price of item 2 'item2Price'.
        Prompt user for quantity of item 2 'item2Num'.
        Prompt user for price of item 3 'item3Price'.
        Prompt user for quantity of item 3 'item3Num'.
        Calculate subtotal, tax, and total.
        Print subtotal.
        Print Tax.
        Print total.
         */
        System.out.print("Enter the price of item 1: ");
        Scanner scanner = new Scanner(System.in);
        double item1Price = scanner.nextDouble();
        System.out.print("Enter the quantity of item 1: ");
        double item1Num = scanner.nextDouble();
        System.out.print("Enter the price of item 2: ");
        double item2Price = scanner.nextDouble();
        System.out.print("Enter the quantity of item 2: ");
        double item2Num = scanner.nextDouble();
        System.out.print("Enter the price of item 3: ");
        double item3Price = scanner.nextDouble();
        System.out.print("Enter the quantity of item 3: ");
        double item3Num = scanner.nextDouble();
        double subtotal = item1Price * item1Num + item2Price * item2Num + item3Price * item3Num;
        final double taxRate = .055;
        double tax = subtotal * taxRate;
        double total = subtotal + tax;
        DecimalFormat ft = new DecimalFormat("#.00");
        System.out.println("Subtotal: $" + ft.format(subtotal));
        System.out.println("Total: $" + ft.format(tax));
        System.out.println("Subtotal: $" + ft.format(total));
    }
}
