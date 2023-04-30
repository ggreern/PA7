/**
 * My submission of this program indicates that this work is my own and follows the
 * JMU Honor Code.
 * 
 * This program receives numbers from the user and finds the largest number in the set along 
 * with how many occurrences there are of the largest number.
 */

package assignment2;

/**
 * Name: Griffin Greer
 * Student ID: 112674762
 * CIS 331 Section 2
 * Assignment 2 - Exercise 5.41
 */

import java.util.Scanner;

public class exercise_5_41 {

    public static void main(String[] args) {

        int count = 1;

        Scanner input = new Scanner(System.in);
        System.out.print("Enter numbers: ");
        int numbers = input.nextInt();
        int max = numbers;

        while (true) {
            numbers = input.nextInt();
            if (numbers == 0) {
                break;
            } else if (numbers > max) {
                max = numbers;
                count = 1;
            } else if (numbers == max) {
                count += 1;
            }

        }
        System.out.println("The largest number is " + max);
        System.out.println("The occurances count of the largest number is " + count);
    }

}
