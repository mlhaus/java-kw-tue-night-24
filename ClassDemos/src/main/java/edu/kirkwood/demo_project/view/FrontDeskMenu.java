package edu.kirkwood.demo_project.view;

import edu.kirkwood.demo_project.controller.UserService;
import edu.kirkwood.shared.UIUtility;
import edu.kirkwood.shared.UserInput;

import java.util.Scanner;

public class FrontDeskMenu implements Menu {
    public void displayMenu(Scanner scanner) {
        String[] menuItems = {"New reservation", "New customer", "Reservation Lookup by customer", "Exit"};
        while(true) {
            UIUtility.printMenu("Front Desk Menu", menuItems);
            int choice = UserInput.getInt("Choose an option", scanner, 1, menuItems.length);
            switch(choice) {
                case 1:
                    // new reservation
                    break;
                case 2:
                    // new customer
                    new UserService().create(scanner);
                    break;
                case 3:
                    // reservation lookup
                    break;
                case 4:
                    // go back to main menu
                    return;
            }
            UIUtility.pressEnterToContinue(scanner);
        }
    }
}
