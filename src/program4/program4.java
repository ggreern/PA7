/**
 * Griffin Greer
 * 112674762
 * CIS331 Section 2
 * Program 4
 * My submission of this program indicates that I've not carried out any action
 * that'd violate the class or JMU Honor Code.
 */


package program4;

import java.util.*;

public class program4 {
    

    public static void main(String[] args) {
        
        OptionOne optionOne = new OptionOne();

        Scanner input = new Scanner(System.in);
        
        System.out.println("How many numbers in the array?");
        
        int totNumbers = input.nextInt();
        
        double[] array1 = new double[totNumbers];
        
        System.out.println("Please enter " + totNumbers + " numbers.");
        
        for (int i = 0; i < array1.length; i++) {
            array1[i] = input.nextDouble();
        }
        
        System.out.println("Enter :\n1 -- to determine if a number is prime\n2 -- to list prime numbers below a given value\n3 -- to compute the statistics from an array of numbers\n4 -- to perform linear search finding a number in the array\n5 -- to display a bar chart of values\n0 -- to quit");
        
        int choice = input.nextInt();
        
        if (choice == 1) {
            System.out.print("Enter a number: ");
            int x = input.nextInt();
            int findPrime = OptionOne.prime(x);
            if (findPrime == 2) {
                System.out.println(x + " is NOT a prime number");
            } else {
                System.out.println(x + " IS a prime number");
                        
                        }
            }
        else if (choice == 2) {
            System.out.print("Enter a number: ");
            int x = input.nextInt();
            boolean[] prime = new boolean[x + 1];
            for (int i = 2; i <= x; i++) {
            prime[i] = true;
        }
        
            for (int i = 2; i * i <= x; i++) {
                if (prime[i]) {
                    for (int j = i * i; j <= x; j += i) {
                        prime[j] = false;
                }
            }
        }
        
            System.out.print("Prime numbers up to " + x + ": ");
                for (int i = 2; i <= x; i++) {
                    if (prime[i]) {
                        System.out.print(i + " ");
            }
        }
            
        }
        else if (choice == 3) {
            double x = OptionThree.average(array1);
            System.out.println("The average of: " + Arrays.toString(array1) + " is " + x);
            double y = OptionThreeST.stDev(array1);
            System.out.println("The standard deviation of: " + Arrays.toString(array1) + " is " + y);
        }
        
        else if (choice == 4) {
            String x = OptionFour.search(array1);
            System.out.println(x);
            
            
            }
        
        else if (choice == 5) {
            BarChartFrame.BarChartStart(array1);
            
        }
        
        else if (choice == 0) {
            System.out.println("Goodbye.");
            System.exit(0);
        }
        else {
            System.out.println("The choice you entered is not valid");
            System.exit(0);
        }
    }
    
    
}
    
