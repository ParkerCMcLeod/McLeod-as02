/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Parker McLeod
 */


import java.util.Scanner;

public class Solution15 {
    public static void main(String[] args) {
        /*1
        Prompt user for String 'password'.
        If 'password' == "abc$123", print "Welcome".
        Else print "I don't know you".
         */
        System.out.print("What is the password? ");
        Scanner scanner = new Scanner(System.in);
        String password = scanner.nextLine();
        if (password.equals("abc$123")) {
            System.out.print("Welcome!");
        } else {
            System.out.print("I don't know you.");
        }
    }

}
