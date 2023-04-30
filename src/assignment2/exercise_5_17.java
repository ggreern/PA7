/**
 * My submission of this program indicates that this work is my own and follows the
 * JMU Honor Code.
 * 
 * This program creates a pyramid with the amount of lines determined by what the user inputs
 */

package assignment2;

/**
 *Name: Griffin Greer
 * Student ID: 112674762
 * CIS 331 Section 2
 * Assignment 2 - Exercise 5.17
*/

import java.util.Scanner;

public class exercise_5_17 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        // Get the number of lines from the user
        System.out.print("Enter the number of lines: ");
        int lines = input.nextInt();

        for (int rows = 1; rows <= lines; rows++) {
            // creating speaces in each row
            for (int i = lines - rows; i >= 1; i--) {
                System.out.print("  ");

            }
            for (int j = rows; j >= 2; j--) {
                System.out.print(j + " ");
            }

            for (int x = 1; x <= rows; x++) {
                System.out.print(x + " ");
            }

            System.out.println();
        }

    }

}
