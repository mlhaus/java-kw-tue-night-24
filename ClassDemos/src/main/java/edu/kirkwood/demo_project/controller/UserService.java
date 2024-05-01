package edu.kirkwood.demo_project.controller;

import edu.kirkwood.demo_project.data.UserDAO;
import edu.kirkwood.demo_project.model.User;
import edu.kirkwood.shared.UIUtility;
import edu.kirkwood.shared.UserInput;

import java.util.Scanner;

public class UserService implements Service {
    @Override
    public void create(Scanner scanner) {
        UIUtility.displayMessage("Create new user");
        User user = new User();

        String email = UserInput.getEmail("Email", scanner);
        User userFromDatabase = UserDAO.getUser(email);
        if(userFromDatabase != null) {
            UIUtility.displayWarning("That email is already taken");
            return;
        }
        user.setEmail(email);
        
        String firstName = UserInput.getString("First name", scanner, true);
        user.setFirstName(firstName);
        
        String lastName = UserInput.getString("Last name", scanner, true);
        user.setLastName(lastName);
        
        boolean userWasAdded = UserDAO.addUser(user);
        UIUtility.displayMessage(userWasAdded ? "User added" : "User not added");
        
    }
}
