/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Parker McLeod
 */

import java.util.Scanner;

public class Solution22 {
    public static void main(String[] args) {
        /*
        Prompt user for first number 'num1'.
        Prompt user for second number 'num2'.
        Prompt user for third number 'num3'.
        Print largest number.
         */
        System.out.print("Eneter the first number: ");
        Scanner scanner = new Scanner(System.in);
        int num1 = scanner.nextInt();
        System.out.print("Eneter the second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Eneter the thrid number: ");
        int num3 = scanner.nextInt();
        if (num1 == num2 || num2 == num3 || num1 == num3) {
            return;
        } else if (num1 > num2 && num1 > num3) {
            System.out.print("The largest number is " + num1 + ".");
        } else if (num2 > num1 && num2 > num3) {
            System.out.print("The largest number is " + num2 + ".");
        } else {
            System.out.print("The largest number is " + num3 + ".");
        }
    }
}

