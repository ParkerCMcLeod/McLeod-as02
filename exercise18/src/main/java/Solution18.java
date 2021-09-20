

/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Parker McLeod
 */

import java.text.DecimalFormat;
import java.util.Scanner;

public class Solution18 {
    public static void main(String[] args) {
        /*
        Prompt user for char 'temperatureUnit'.
        Prompt user for int 'temperature'.
        Print the conversion.
         */
        System.out.println("Press C to convert from Fahrenheit to Celsius.");
        System.out.println("Press g to convert from Celsius to Fahrenheit.");
        System.out.print("Your choice: ");
        Scanner scanner = new Scanner(System.in);
        char temperatureUnit = scanner.next().charAt(0);
        double temp = 0.0;
        if (temperatureUnit == 'c' || temperatureUnit == 'C') {
            System.out.print("Please enter the temperature in Fahrenheit: ");
            temp = scanner.nextDouble();
        } else if (temperatureUnit == 'f' || temperatureUnit == 'F'){
            System.out.print("Please enter the temperature in Celsius: ");
            temp = scanner.nextDouble();
        }
        double result = 0.0;
        if (temperatureUnit == 'c' || temperatureUnit == 'C') {
            result = (temp - 32) * 5 / 9;
        } else if (temperatureUnit == 'f' || temperatureUnit == 'F'){
            result = (temp * 9 / 5) + 32;
        }
        DecimalFormat ft = new DecimalFormat("####");
        if (temperatureUnit == 'c' || temperatureUnit == 'C') {
            System.out.print("The temperature in Celsius is " + ft.format(result) + ".");
        } else if (temperatureUnit == 'f' || temperatureUnit == 'F'){
            System.out.print("The temperature in Fahrenheit is " + ft.format(result) + ".");
        }

    }
}
