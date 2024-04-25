package edu.kirkwood.demo_project.model;

import edu.kirkwood.demo_project.data.UserDAO;
import edu.kirkwood.shared.UIUtility;

import java.util.ArrayList;

public class User {
    // Declare attributes (aka instance variables, fields)
    private int userId;
    private String firstName;
    private String lastName;
    private String email;

    // constructor - used to instantiate User objects
    public User() {
        
    }
    
    public User(int userId, String firstName, String lastName, String email) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }

    public int getUserId() {
        return userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public static void printTableHeader() {
        UIUtility.printLine(78);
        System.out.printf("| %-5s | %-15s | %-15s | %-30s |\n", "Id", "First Name", "Last Name", "Email Address");
        UIUtility.printLine(78);
    }

    public String toString() {
        return String.format("| %5d | %-15s | %-15s | %-30s |",
                userId, firstName, lastName, email);
    }

    public static void printTable() {
        printTableHeader();
        ArrayList<User> users = UserDAO.getAllUsers();
        for(User user : users) {
            System.out.println(user);
        }
    }

}
