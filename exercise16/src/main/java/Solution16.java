/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Parker McLeod
 */


import java.util.Scanner;

public class Solution16 {
    public static void main(String[] args) {
        /*
        Prompt user for age.
        Print if the user is able to drive legally.
         */
        System.out.print("What is your age? ");
        Scanner scanner = new Scanner(System.in);
        int age = scanner.nextInt();
        String output = age >= 16
            ? "You are old enough to legally drive."
            : "You are not old enough to legally drive.";
        System.out.print(output);
    }
}
