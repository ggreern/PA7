
package program5;

import java.util.*;
import java.io.*;

public class UserApplication {

    private static final String File_Name = "users.txt";
    
    public static void main(String[] args) {
        user[] users = new user[user.MAXUSERS];
        Scanner input = new Scanner(System.in);
        int totUsers = 0;
        int choice = 0;
        
        System.out.println("Choices are:\n(1) Read user file\n(2) Add new user\n(3) List users\n(4) Display information about a user\n(5) User login\n(6) Write user file\n(7) Quit\n\n");
        System.out.println("What is your choice? (1-7)");
        choice = input.nextInt();
        
         
            
        
        
        switch (choice) {
            case 1: {
                try {
                    File file = new File(File_Name);
                    try (Scanner fileInput = new Scanner(file)) {
                        while (fileInput.hasNextLine()) {
                            String line = fileInput.nextLine();
                            String[] parts = line.split(",");
                            if (parts.length == 4) {
                                String firstname = parts[0];
                                String lastname = parts[1];
                                String userId = parts[2];
                                String password = parts[3];
                                users[totUsers] = new user.addUser(firstname, lastname, userId, password, true);
                                totUsers++;
                                if (totUsers >= user.MAXUSERS) {
                                    break;
                                }
                            }
                        }
                        
                    }
                    
                System.out.println("User data has been read from file");
                } catch (IOException e) {
                        System.out.println("Error reading file: " + e.getMessage());
                        }
                
        } break;
            case 2: {
                if (totUsers >= user.MAXUSERS) {
                    System.out.println("List is full and another user cannot be added");
                }
                else {
                    System.out.println("Enter the user's first and then last name");
                    String firstname = input.nextLine();
                    String lastname = input.nextLine();
                    System.out.println("Enter the user id: ");
                    String userId = input.nextLine();
                    System.out.println("Enter the user password: ");
                    String password = input.nextLine();
                    
                    System.out.println(String.join(" ", userId, firstname, lastname, userId, password));
                    boolean isUserAdded = user.addUser(firstname, lastname, userId, password, true);
                    if (isUserAdded) {
                        System.out.println("User added");
                    }
                    else {
                        System.out.println("The list is full");
                    }
                }
                
                
            } break;
            
            case 3: {
                String userList = user.listUsers();
                System.out.println("User list\n\t" + userList);
                
            } break;
            
            case 4: {
                System.out.print("Enter the user first and last name to search for: ");
                String find = input.nextLine();
                int index = user.findUser(find);
                if (index < 0) {
                    System.out.println(find + " not found");
                }
                else {
                    user user = user.getUser(index);
                    String userInfo = user.userInfo(true);
                    System.out.println(userInfo);
                }
                
            } break;
            
            case 5: {
                System.out.println("Enter user id and password");
                String userId = input.nextLine();
                String password = input.nextLine();
                String message = user.userLogin(userId, password);
                System.out.println(message);
                
            } break;
            case 6: {
                try {
                    Printwriter writer = new PrintWriter(new File("users.txt"));
                    
                    for (user user: users) {
                        writer.printf("%s\t%s\t%s\t%s%n", user.getFirstname(), user.getLastname(), user.getUserId, user.getPassword());
                    }
                    
                    writer.close();
                    System.out.println("User file written");
                    } catch (FileNotFoundException e) {
                        System.err.println("Error " + e.getMessage());
                }
            } break;
            
            case 7: {
                System.exit(0);
            }
            
            default:
                System.out.println("Invalid choice");
                
            }
                
                
        }
        
        
    
}
