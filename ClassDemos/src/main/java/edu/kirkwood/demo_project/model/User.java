package edu.kirkwood.demo_project.model;

public class User {
    // Declare attributes (aka instance variables, fields)
    private int userId;
    private String firstName;
    private String lastName;
    private String email;
    
    // constructor - used to instantiate User objects
    public User(int userId, String firstName, String lastName, String email) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }
    
    public String toString() {
        return String.format("User{id: %d, firstName: %s, lastName: %s, email: %s}",
                userId, firstName, lastName, email);
    }
    
}
