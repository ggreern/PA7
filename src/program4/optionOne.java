/**
 * Griffin Greer
 * 112674762
 * CIS331 Section 2
 * Program 4
 * My submission of this program indicates that I've not carried out any action
 * that'd violate the class or JMU Honor Code.
 */
package program4;


public class OptionOne {


    static int prime(int x) {
        if (x <= 1) {
            int answer = 2;
            return answer;
}
        for (int i = 2; i <= Math.sqrt(x); i++) {
            if (x % i ==0) {
                int answer = 2;
                return answer;
                
            }
        }
        return 1;
    

    }
    

