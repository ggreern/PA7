/**
 * Griffin Greer
 * 112674762
 * CIS331 Section 2
 * Program 4
 * My submission of this program indicates that I've not carried out any action
 * that'd violate the class or JMU Honor Code.
 */
package program4;


public class OptionThreeST {


    public static double stDev(double[] array1) {
        
        double sum = 0.0;
        for (int i = 0; i < array1.length; i++) {
            sum += Math.pow(array1[i] - OptionThree.average(array1), 2);
        }
        
        double var = sum / array1.length;
        double standardDev = Math.sqrt(var);
        
        return standardDev;

        
    }
    
}
