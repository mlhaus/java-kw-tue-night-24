package edu.kirkwood.demo_project.view;

import edu.kirkwood.shared.UIUtility;
import edu.kirkwood.shared.UserInput;

import java.util.Scanner;

public class MainMenu implements Menu {

    public void displayMenu(Scanner scanner) {
        String[] menuItems = {"Front Desk", "Admin", "Quit"};
        while(true) {
            UIUtility.printMenu("Main Menu", menuItems);
            int choice = UserInput.getInt("Choose an option", scanner, 1, menuItems.length);
            switch(choice) {
                case 1:
                    new FrontDeskMenu().displayMenu(scanner);
                    break;
                case 2:
                    new AdminMenu().displayMenu(scanner);
                    break;
                case 3:
                    return;
            }
        }
    }
}
