/**
 * My submission of this program indicates that this work is my own and follows the
 * JMU Honor Code.
 *
 * This program takes numbers from the user and puts them into an array to determine the amount
 * of distinct numbers and which numbers they are.
 */
package assignment2;

/**
 * Name: Griffin Greer 
 * Student ID: 112674762 
 * CIS 331 Section 2 
 * Assignment 2 - Exercise 7.5
 */
import java.util.Scanner;

public class exercise_7_5 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter 10 numbers: ");
        int[] numbers = new int[10];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }
        int count = 0;
        for (int i = 0; i < numbers.length; i++) {
            boolean found = false;
            for (int j = 0; j < i; j++) {
                if (numbers[i] == numbers[j]) {
                    found = true;
                }
            }

            if (!found) {
                ++count;

            }
        }
        System.out.println("The number of distinct numbers is " + count);

        System.out.print("The distinct numbers are: ");

        for (int i = 0; i < numbers.length; i++) {
            boolean found = false;
            for (int j = 0; j < i; j++) {
                if (numbers[i] == numbers[j]) {
                    found = true;

                }
            }
            if (!found) {
                System.out.print(" " + numbers[i]);

            }
        }
        System.out.println();

    }

}
