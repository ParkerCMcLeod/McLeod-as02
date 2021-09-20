/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Parker McLeod
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Solution09 {
    public static void main(String[] args) {
        /*
        Prompt for length 'length'.
        Promp for width 'width'.
        Print how many gallons you need to purchase to cover the number of square feet.
         */
        System.out.print("Enter the length of the ceiling in feet: ");
        Scanner scanner = new Scanner(System.in);
        double length = scanner.nextDouble();
        System.out.print("Enter the width of the ceiling in feet: ");
        double width = scanner.nextDouble();
        final int conversion = 350;
        DecimalFormat ft = new DecimalFormat("####");
        System.out.println("You will need to purchase " + ft.format(Math.ceil(length*width / conversion)) +
        " gallons of paint to cover " +  ft.format(length*width) + " square feet.");


    }
}
