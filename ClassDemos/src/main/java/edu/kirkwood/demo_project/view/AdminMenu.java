package edu.kirkwood.demo_project.view;

import edu.kirkwood.demo_project.model.Reservation;
import edu.kirkwood.demo_project.model.Room;
import edu.kirkwood.demo_project.model.User;
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
                    UIUtility.displayMessage(menuItems[0]);
                    Room.printTable();
                    break;
                case 2:
                    // view all customers
                    UIUtility.displayMessage(menuItems[1]);
                    User.printTable();
                    break;
                case 3:
                    // view all reservations
                    UIUtility.displayMessage(menuItems[2]);
                    Reservation.printTable();
                    break;
                case 4:
                    // add new room
                    break;
                case 5:
                    // go back to main menu
                    return;
            }
            UIUtility.pressEnterToContinue(scanner);
        }
    }
}
