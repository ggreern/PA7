/**
 * My submission of this program indicated that this work is my own and follows the
 * JMU Honor Code.
 *
 * This program gets the investment amount, annual interest rate, and number of years
 * to calculate the future investment value.
 */
package assignment1;

/**
 * Name: Griffin Greer Student ID: 112674762 
 * CIS 331 Section 2 
 * February 2, 2023
 * Assignment 1 - Exercise 2.21
 */
import java.util.Scanner;

public class Exercise_2_21_futureInvestmentValue {

    public static void main(String[] args) {

        //Get the investment amount, annual interest rate, and year
        Scanner input = new Scanner(System.in);

        System.out.print("Enter investment amount: ");

        double investmentAmount = input.nextDouble();

        System.out.print("Enter annual interest rate in percentage: ");

        double annualInterestRate = input.nextDouble();

        System.out.print("Enter number of years: ");

        int years = input.nextInt();

        //Processing future investment value
        double monthlyInterestRate = (annualInterestRate / 100) / 12; //convert annual interest rate to monthly interest rate

        double futureValue = investmentAmount * Math.pow((1 + monthlyInterestRate), years * 12); //equation to get future value of investment

        //Output future investment value
        System.out.printf("Future value is $%.2f", futureValue);

        System.out.println();

    }

}
