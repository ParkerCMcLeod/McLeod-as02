/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Parker McLeod
 */

import java.time.Year;
import java.util.Scanner;

public class Solution06 {
    public static void main(String[] args) {
        /*
        1. Prompt user for their current age
        2. Store response as int 'currentAge'
        3. Prompt user for age they want to retire
        4. Store response as int 'retirementAge'
        5. Print how many years they have left until retirement.
        6. Get current calendar year and store as int 'currentYear'.
        7. Print the year and what year they retire.
         */
        System.out.print("What is your current age? ");
        Scanner scanner = new Scanner(System.in);
        int currentAge = scanner.nextInt();
        System.out.print("At what age would you like to retire? ");
        int retirementAge = scanner.nextInt();
        System.out.println("You have " + (retirementAge-currentAge) + " years left until you can retire.");
        int year = Year.now().getValue();
        System.out.println("It's " + year + ", so you can reitre in " + (year+(retirementAge-currentAge)) + ".");

    }
}
