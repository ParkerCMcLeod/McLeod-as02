/*
 *  UCF COP3330 Fall 2021 Assignment 2 Solution
 *  Copyright 2021 Parker McLeod
 */


import java.util.Scanner;

public class Solution23 {
    public static void main(String[] args) {
        /*
            if (Are the battery terminals corroded?) then (yes)
                :Clean terminals and try starting again.;
                stop
            else (no)
                :Replace cables and try again.;
                stop
            endif
        else (no)
            if (Does the car make a slicking noise?) then (yes)
                :Replace the battery.;
                stop
            else (no)
                if (Does the car crank up but fail to start?) then (yes)
                    :Check spark plug connections.;
                    stop
                else (no)
                    if (Does the engine start and then die?) then (yes)
                        if (Does you car have fuel injection?) then (yes)
                            :Get it in for service.;
                            stop
                        else (no)
                            :Check to ensure the choke is opening and closing.;
                            stop
                        endif
                    else (no)
                        :This should not be possible.;
                        stop
                    endif
                endif
            endif
        endif
         */
        System.out.print("Is the car silent when you turn the key? ");
        Scanner scanner = new Scanner(System.in);
        char answer1 = scanner.next().charAt(0);
        if (answer1 == 'y') {
            System.out.print("Are the battery terminals corroded? ");
            char answer2 = scanner.next().charAt(0);
            if (answer2 == 'y') {
                System.out.print("Clean terminals and try starting again.");
            } else {
                System.out.print("Replace cables and try again.");
            }
        } else {
            System.out.print("oes the car make a slicking noise? ");
            char answer3 = scanner.next().charAt(0);
            if (answer3 == 'y') {
                System.out.print("Replace the battery.");
            } else {
                System.out.print("Does the engine start and then die? ");
                char answer4 = scanner.next().charAt(0);
                if (answer4 == 'y') {
                    System.out.print("Does you car have fuel injection? ");
                    char answer5 = scanner.next().charAt(0);
                    if (answer5 == 'y') {
                        System.out.print("Get it in for service. ");
                    } else {
                        System.out.print(":Check to ensure the choke is opening and closing. ");
                    }
                } else {
                    System.out.print("This should not be possible. ");
                }
            }
        }
    }
}
