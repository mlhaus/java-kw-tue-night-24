package edu.kirkwood.demo_project.view;

import edu.kirkwood.shared.UIUtility;
import edu.kirkwood.shared.UserInput;

import java.util.Scanner;

public class AdminMenu implements Menu {

    public void displayMenu(Scanner scanner) {
        String[] menuItems = {"View all rooms", "View all customers", "View all reservations", "Add new room", "Exit"};
        while(true) {
            UIUtility.printMenu("Admin Menu", menuItems);
            int choice = UserInput.getInt("Choose an option", scanner, 1, menuItems.length);
            switch(choice) {
                case 1:
                    // view all rooms
                    break;
                case 2:
                    // view all customers
                    break;
                case 3:
                    // view all reservations
                    break;
                case 4:
                    // add new room
                    break;
                case 5:
                    // go back to main menu
                    return;
            }
        }
    }
}
