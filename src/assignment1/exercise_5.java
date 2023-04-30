/**
 * My submission of this program indicates that this work is my own and follows the
 * JMU Honor Code.
 *
 * This program allows the user to enter two numbers and pick what kind of mathematical equation
 * to perform on the numbers and displays the output.
 */
package assignment1;

/**
 * Name: Griffin Greer Student ID: 112674762 
 * CIS 331 Section 2 
 * February 2, 2023
 * Assignment 1 - Problem 5
 *
 */
import java.util.Scanner;

public class exercise_5 {

    public static void main(String[] args) {

        //Get the two numbers from the user
        Scanner input = new Scanner(System.in);
        double answer = 0.0;

        System.out.print("Enter two numbers: ");

        double x = input.nextDouble();

        double y = input.nextDouble();

        System.out.print("Enter 1 to add, 2 to subtract, 3 to multiply, or 4 to divide. "); //find whether to add, subtract, multiply, or divide 

        int choice = input.nextInt();

        switch (choice) {  //switch statement to do the correct math equation and output it
            case 1:
                answer = x + y;
                System.out.println("The answer is " + answer);
                break;

            case 2:
                answer = x - y;
                System.out.println("The answer is " + answer);
                break;

            case 3:
                answer = x * y;
                System.out.println("The answer is " + answer);
                break;

            case 4:
                answer = x / y;
                System.out.println("The answer is " + answer);
                break;
            default:
                System.out.print("The value you entered is not an option.");
                break;

        }

    }

}
