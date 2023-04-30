/**
 * Griffin Greer
 * 112674762
 * CIS331 Section 2
 * Program 5
 * My submission of this program indicates that I've not carried out any action
 * that'd violate the class or JMU Honor Code.
 */
package program5;

import java.util.*;

public class TestUser {


    public static void main(String[] args) {

        user userOne = new user();
        user userTwo = new user("Griffin", "Greer", "f23423234", "ThePassword");
        user userThree = new user();
        
        List<user> userList = new ArrayList<>();
        userList.add(new user("John", "Doe", "j23445353", "Firstpassword"));
        userList.add(new user("Steven", "Hill", "2398439", "5second#password"));
        
        for (user user : userList) {
            String userInfo = user.userInfo(false);
            System.out.println(userInfo);
        }
        
        for (user user : userList) {
            String userInfo = user.userInfo(true);
            System.out.println(userInfo);
        }
        userOne.setFirstname("Jim");
        userOne.setLastname("Tiller");
        userOne.setUserId("t235254223");
        userOne.setPassword("Passwordpassword");
        System.out.println(userOne.getFirstname());
        System.out.println(userOne.getLastname());
        System.out.println(userOne.getUserId());
        System.out.println(userOne.getPassword());
        
        userThree.setUserId("8ad");
        System.out.println(userThree.getUserId());
        userThree.setPassword("ergs");
        System.out.println(userThree.getUserId());
       
        if (userTwo.equals("Griffin Greer")) {
            System.out.println("This matches");
        } else
            System.out.println("This does not match");
            
                
    }
    
}
