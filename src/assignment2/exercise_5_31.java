/**
 * My submission of this program indicates that this work is my own and follows the
 * JMU Honor Code.
 * 
 * This program gets the elements of a CD and presents the CD value at specific months.
 */

package assignment2;

/** 
 * Name: Griffin Greer
 * Student ID: 112674762
 * CIS 331 Section 2
 * Assignment 2 - Exercise 5-31
 */

import java.util.Scanner;

public class exercise_5_31 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // Get the CD amount, annual percentage yield and maturity period from the user
        System.out.print("Enter the initial deposit amount: ");
        double depositAmount = input.nextDouble();

        System.out.print("Enter annual percentage yield: ");
        double percentYield = input.nextDouble();

        System.out.print("Enter maturity period (number of months): ");
        int months = input.nextInt();

        System.out.println("\nMonth\tCD Value");
        for (int i = 1; i <= months; ++i) {
            depositAmount *= (1 + (percentYield / 1200));
            System.out.printf("%d\t%.2f\n", i, depositAmount);

        }

    }

}
