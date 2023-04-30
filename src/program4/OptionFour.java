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

public class OptionFour {


    static String search(double[] array1) {
        
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter a double number: ");
        
        double x = input.nextDouble();
        
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] == x) {
                int y = i;
                String s = ("The value " + x + " is found in position " + i);
                return s;
            }
            
            
            }
        String str = ("The value " + x + " is not in the array");
        return str;
                    
        }

        
    }
    

