/**
 * My submission of this program indicates that this work is my own and follows the
 * JMU Honor Code.
 * 
 * This program puts students' scores into an array and assigns each student their
 * grade based on their number score.
 */

package assignment2;

/**
 * Name: Griffin Greer
 * Student ID: 112674762
 * CIS 331 Section 2
 * Assignment 2 - Exercise 7.1
 */
import java.util.Scanner;

public class exercise_7_1 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int i = 0;
        System.out.print("Enter the number of students: ");
        int n = input.nextInt();

        System.out.printf("Enter %d scores: ", n);

        int[] scores = new int[n];
        int best = 0;

        for (i = 0; i < n; i++) {
            scores[i] = input.nextInt();

            if (best < scores[i]) {
                best = scores[i];
            }
        }
        for (i = 0; i < n; i++) {
            char grade = ' ';

            if (scores[i] >= best - 10) {
                grade = 'A';
            } else if (scores[i] >= best - 20) {
                grade = 'B';
            } else if (scores[1] >= best - 30) {
                grade = 'C';
            } else if (scores[i] >= best - 40) {
                grade = 'D';
            }
            System.out.printf("Student %d score is %d and grade is %c\n", i, scores[i], grade);

        }

    }

}
