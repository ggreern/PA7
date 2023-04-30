/**
 * Griffin Greer
 * 112674762
 * CIS331 Section 2
 * Program 4
 * My submission of this program indicates that I've not carried out any action
 * that'd violate the class or JMU Honor Code.
 */
package program4;


public class OptionThree {


    static double average(double[] array1) {

        double sum = 0.0;
            for (int i = 0; i < array1.length; i++) {
                sum += array1[i];
            }
            double average = sum / array1.length;
            
            return average;
    
                    }
}
