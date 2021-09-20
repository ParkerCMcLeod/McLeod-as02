/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Parker McLeod
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Solution07 {
    public static void main(String[] args) {
        /*
        Prompt length of room in feet.
        Store user response as double 'length'.
        Prompt user width of room in feet.
        Store user response as double 'width'.
        Print dimensions.
        Print area in square feet and square meters.
         */
        System.out.print("What is the length of the room in feet? ");
        Scanner scanner = new Scanner(System.in);
        double length = scanner.nextDouble();
        System.out.print("What is the width of the room in feet? ");
        double width = scanner.nextDouble();
        System.out.println("The area is");
        DecimalFormat ft = new DecimalFormat("####");
        System.out.println(ft.format(length * width) + " square feet");
        ft = new DecimalFormat("#.###");
        final double constant = 0.09290304;
        System.out.println(ft.format(length * width * constant) + " square meters");

    }
}
