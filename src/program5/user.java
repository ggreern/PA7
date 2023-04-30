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
import java.security.NoSuchAlgorithmException;
import java.security.MessageDigest;


public class user {

    private String firstname;
    private String lastname;
    private String userId;
    private String password;
    public static final int MAXUSERS = 4;
    private static user[] users = new user[MAXUSERS];
    private static int totUsers = 0;

    public user() {
        firstname = "FIRST";
        lastname = "LAST";
        userId = "Unknown";
        password = "Unknown";
    }
    
    public static String listUsers() {
        String userList = "";
        for (int i = 0; i < totUsers; i++) {
            userList += users[i].firstname + " " + users[i].lastname + " " + users[i].userId + "\n";
        }
        return userList;
    }
    
    public static int findUser(String name) {
        for (int i = 0; i < totUsers; i++) {
            String checkName = users[i].firstname + " " + users[i].lastname;
                if (checkName.equalsIgnoreCase(name)) {
                    return i;
                }
        }
        return -1;
    }
    
    public static boolean addUser(String firstname, String lastname, String userID, String password, boolean hash) {
        if (totUsers >= MAXUSERS) {
            return false;
        }
        user newUser;
        if (hash) {
            newUser = new user(firstname, lastname, userID, password);
        } else {
            newUser = new user(firstname,lastname, userID, password);
        }
        
        users[totUsers] = newUser;
        totUsers++;
        
        return true;
    }
    
    public static user getUser(int x) {
        if (x >= 0 && x < totUsers) {
            return users[x];
        } else {
            return null;
        }
    }
    
    public static String userLogin(String userId, String password) {
        int userIndex = -1;
        for (int i = 0; i < totUsers; i++) {
            if (users[i].userId.equalsIgnoreCase(userId)) {
                userIndex = i;
                for (int y = 0; y < totUsers; y++) {
                    if (users[y].password.equalsIgnoreCase(password) && y == i) {
                        return "login successful. Welcome " + users[i].firstname + " " + users[i].lastname + "!";
                    } 
                    if (users[y].password.equalsIgnoreCase(password) && y != i) {
                        return "Password does not match user ID";
                    }
                    }
                }
            else {
                return "User " + userId + " does not exist";
            }
            }
        return password + " is and Invalid password";
    }
    
    
    public user(String firstname, String lastname, String userId, String password) {
        setFirstname(firstname);
        setLastname(lastname);
        setUserId(userId);
        setPassword(password);
    
}
    public String userInfo(boolean x) {
        String info = "";
        if (x) {
            info += "First Name: " + firstname;
            info += "\nLast Name: " + lastname;
            info += "\nUser ID: " + userId;
            info += "\nPassword: " + password;
        }
        else
        {
            info += firstname + " " + lastname;
        }
        return info;
    }
    
    public boolean equals(String x) {
        String[] fullName = x.split(" ");
        String firstName = fullName[0];
        String lastName = fullName[1];
        return this.firstname.equalsIgnoreCase(firstName) && this.lastname.equalsIgnoreCase(lastName);
    }
    
    public String getFirstname() {
        return firstname;
    }
    
    public void setFirstname(String firstname) {
        this.firstname = firstname.substring(0,1).toUpperCase() + firstname.substring(1).toLowerCase();
    }
    
    public String getLastname() {
        return lastname;
    }
    
    public void setLastname(String lastname) {
        this.lastname = lastname.substring(0,1).toUpperCase() + lastname.substring(1).toLowerCase();
    }
    
    public String getUserId() {
        return userId;
    }
    
    public void setUserId(String userId) {
        if (Character.isLetter(userId.charAt(0)) && userId.matches("^[a-zA-z][a-zA-Z0-9]*$")) {
            this.userId = userId;
        }
        else {
            this.userId = "Unkown";
        }
    }
    
    public String getPassword() {
        return password;
    }
    
    private boolean isValidPassword(String password) {
        String pattern = "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$";
        return password.matches(pattern);
    }
    
    public void setPassword(String password) {
        if (isValidPassword(password)) {
            try {
                MessageDigest md = MessageDigest.getInstance("SHA-256");
                byte[] hash = md.digest(password.getBytes());
                this.password = toHexString(hash);
            }
            catch (noSuchAlgorithmException e) {
                
            }   
        }
        else {
            this.password = "Unknown";
        }
    }
    
    private static String toHexString (byte[] hash) {
        StringBuilder sb = new StringBuilder();
        for (byte b : hash) {
            sb.append(String.format("%02x", b));
        }
        return sb.toString();
    }
    
    
}
