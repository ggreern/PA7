/**
 * My submission of this program indicates that this work is my own and follows the
 * JMU Honor Code.
 *
 * This program gets the subtotal and gratuity rate from input and based on that,
 * calculates the total gratuity and total amount.
 */
package assignment1;

/**
 * Name: Griffin Greer Student ID: 112674762 
 * CIS 331 Section 2 
 * February 2, 2023
 * Assignment 1 - Exercise 2.5
 */
import java.util.Scanner;

public class Exercise_2_5_Calculate_Tips {

    public static void main(String[] args) {

        //Get subtotal and gratuity rate
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the subtotal: ");
        double subtotal = input.nextDouble();

        System.out.print("Enter the gratuity rate (in %): ");
        double gratuityRate = input.nextDouble();

        double gratuity = subtotal * gratuityRate / 100.0;

        double total = gratuity + subtotal;

        //Output results
        System.out.printf("The gratuity is $%.1f and total is $%.1f", gratuity, total);
        System.out.println();

    }

}
