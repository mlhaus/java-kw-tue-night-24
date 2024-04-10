package edu.kirkwood.shared;

import java.util.Scanner;

public class UIUtility {

    public static void printMenu(String title, String[] menuItems) {
        displayMessage(title);
        printLine();
        for(int i = 0; i < menuItems.length; i++) {
            System.out.println((i + 1) + ") " + menuItems[i]);
        }
        printLine();
    }

    public static void printLine() {
        for(int i = 0; i < 50; i++) {
            System.out.print("-");
        }
        System.out.println();
    }

    public static void pressEnterToContinue(Scanner scanner) {
        UserInput.getString("Press enter to continue", scanner);
    }
    public static void displayMessage(String message) {
        System.out.printf("*** %s ***\n", message);
    }

    public static void displayMessage(String message, String type) {
        System.out.printf("*** %s - %s ***\n", type.toUpperCase(), message);
    }

    public static void displayError(String message) {
        displayMessage(message, "error");
    }

    public static void displayWarning(String message) {
        displayMessage(message, "warning");
    }

    public static void displaySuccess(String message) {
        displayMessage(message, "success");
    }

}
