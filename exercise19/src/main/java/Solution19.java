/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Parker McLeod
 */


import java.text.DecimalFormat;
import java.util.Scanner;

public class Solution19 {
    public static void main(String[] args) {
        /*
        Prompt for user weight in pounds double 'weight'.
        Prompt for user height in inches double 'height'.
        Calculate double 'bMI'.
        Print what weight range the user is in.
         */
        System.out.print("Enter you weight in pounds: ");
        Scanner scanner = new Scanner(System.in);
        double weight = scanner.nextDouble();
        System.out.print("Enter you height in inches: ");
        double height = scanner.nextDouble();
        double BMI = (weight / (height * height)) * 703;
        DecimalFormat ft = new DecimalFormat("#.0");
        System.out.println("Your BMI is " + ft.format(BMI));
        if (BMI < 18.5) {
            System.out.println("You are underweight. You should see your doctor.");
        } else if (BMI >= 18.5 && BMI <= 25) {
            System.out.println("You are within the ideal weight range.");
        } else {
                System.out.println("You are overweight. You should see your doctor.");
        }
    }
}
