/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Parker McLeod
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Solution17 {
    public static void main(String[] args) {
        /*
        Prompt user for int 'weight'.
        Check if numeric. If not, repeat prompt.
        Promp user for int 'gender'.
        Check if numeric. If not, repeat prompt.
        Prompt user for int totalAlcohol.
        Check if numeric. If not, repeat prompt.
        Prompt user for int timeSinceLastDrink.
        Check if numeric. If not, repeat prompt.
        Print BAC calculated based on gender.
        Print legality to drive based on BAC.
         */
        System.out.print("Enter a 1 if you are male or a 2 if your are female: ");
        Scanner scanner = new Scanner(System.in);
        int gender = scanner.nextInt();
        System.out.print("How many ounces of alcohol did you have? ");
        double totalAlcohol = scanner.nextDouble();
        System.out.print("What is your weight, in pounds? ");
        double weight = scanner.nextDouble();
        System.out.print("How many hours has it been since your last drink? ");
        double timeSinceLastDrink = scanner.nextDouble();
        System.out.print("\n");
        double BAC = 0.0;
        if (gender == 1) {
            BAC = (totalAlcohol * 5.14 / weight * .73) - .015 * timeSinceLastDrink;
        } else {
            BAC = (totalAlcohol * 5.14 / weight * .66)- .015 * timeSinceLastDrink;
        }
        DecimalFormat ft = new DecimalFormat("#.000000");
        System.out.println("Your BAC is "+ ft.format(BAC));
        if (BAC >= .8) {
            System.out.print("It is not legal for you to drive");
        } else {
            System.out.print("It is legal for you to drive");
        }
    }
}
