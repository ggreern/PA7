/**
 * My submission of this program indicates that this work is my own and follows the
 * JMU Honor Code.
 * 
 * This program gets the month and year from the user and displays how many days were
 * in that month.
 */

package assignment1;

/**
 * Name: Griffin Greer
 * Student ID: 112674762
 * CIS 331 Section 2
 * Assignment 1 - Exercise 3.11
 * 
 */

import java.util.Scanner;

public class Exercise_3_11_numberOfDaysInAMonth {

    public static void main(String[] args) {

        //Input month and year
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the month and year (example: 1 2020): ");

        int month = input.nextInt();

        int year = input.nextInt();

        //Processing into days
        int day = 0;
        if (month == 2) {
            if (year % 4 == 0 && year % 100 != 0) {
                day = 29;
            } else if (year % 400 == 0) {
                day = 29;
            } else {
                day = 28;
            }

        } else if (month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month == 10 || month == 12) {
            day = 31;
        } else {
            day = 30;
        }

        String monthName = "";
        if (month == 1) {
            monthName = "January";
        } else if (month == 2) {
            monthName = "February";
        } else if (month == 3) {
            monthName = "March";
        } else if (month == 4) {
            monthName = "April";
        } else if (month == 5) {
            monthName = "May";
        } else if (month == 6) {
            monthName = "June";
        } else if (month == 7) {
            monthName = "July";
        } else if (month == 8) {
            monthName = "August";
        } else if (month == 9) {
            monthName = "September";
        } else if (month == 10) {
            monthName = "October";
        } else if (month == 11) {
            monthName = "November";
        } else {
            monthName = "Decemeber";
        }
        
        System.out.println(monthName + " " + year + " has " + day + " days.");

    }

}
