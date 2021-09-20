/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Parker McLeod
 */


import java.util.Scanner;

public class Solution08 {
    public static void main(String[] args) {
        /*
        Prompt how many people int 'numPeople'.
        Prompt how many pizzas int 'numPizzas'.
        Prompt how many slices per pizza int 'numSlices'.
        Print numPeople with numPizzas (numSlices*numPizzas).
        Print how many slices per person.
        Print leftover pieces.
         */
        System.out.print("How many people? ");
        Scanner scanner = new Scanner(System.in);
        int numPeople = scanner.nextInt();
        System.out.print("How many pizzas do you have? ");
        int numPizzas = scanner.nextInt();
        System.out.print("How many slices per pizza? ");
        int numSlices = scanner.nextInt();
        System.out.println(numPeople + " people with " + numPizzas + " pizzas (" + (numSlices * numPizzas) + " slices)");
        System.out.println("Each person gets " + ((numSlices * numPizzas) / numPeople) + " pieces of pizza.");
        System.out.println("There are " + ((numSlices * numPizzas) % numPeople) + " leftover pieces.");
    }
}
