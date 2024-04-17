package edu.kirkwood.demo_project;

import edu.kirkwood.demo_project.view.MainMenu;

import java.util.Scanner;

public class HotelApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        new MainMenu().displayMenu(scanner);
        System.out.println("Good bye!");
    }
}
