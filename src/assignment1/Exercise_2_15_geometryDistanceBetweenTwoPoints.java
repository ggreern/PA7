/*
* My submission of this program indicates that this work is my own and follows the
* JMU Honor Code.
*
* This program gets two points from the user and finds the distance between them.
 */
package assignment1;

/**
 * Name: Griffin Greer Student ID: 112674762 
 * CIS 331 Section 2 
 * February 2, 2023
 * Assignment 2 - Exercise 2.15
 */
import java.util.Scanner;

public class Exercise_2_15_geometryDistanceBetweenTwoPoints {

    public static void main(String[] args) {

        //Get x1, y1, x2, and y2
        Scanner input = new Scanner(System.in);

        System.out.print("Enter x1 and y1: ");

        double x1 = input.nextDouble();

        double y1 = input.nextDouble();

        System.out.print("Enter x2 and y2: ");

        double x2 = input.nextDouble();

        double y2 = input.nextDouble();

        //Processing the equation to get the distance between points
        double distance = Math.pow(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2), 0.5);

        System.out.println("The distance between the two points is " + distance);

    }

}
