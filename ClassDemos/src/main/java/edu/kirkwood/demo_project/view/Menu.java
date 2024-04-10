package edu.kirkwood.demo_project.view;

import java.util.Scanner;

public interface Menu {
    // What is an interface?
    // An interface is an abstract class that has abstract or static methods

    // What is an abstract class?
    // An abstract class is class that you cannot instantiate objects from

    // What is an abstract method?
    // An abstract method declares the method signature, without a body
    // Here is an example of an abstract method
    static void displayMenu(Scanner scanner){
        // will be implemented by child classes
    }
}
