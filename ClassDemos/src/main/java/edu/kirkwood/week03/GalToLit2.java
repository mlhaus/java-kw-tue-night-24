package edu.kirkwood.week03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GalToLit2 {
    private static final double LIT_TO_GAL = 3.7854;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("What is your name? ");
        String name = scanner.nextLine();
        System.out.print("How old are you? ");
        int age = scanner.nextInt();
        scanner.nextLine();
        System.out.printf("Hello %s, you are %d years old\n", name, age);
        System.out.print("What school do you attend? ");
        String school = scanner.nextLine();

        System.out.print("Enter number of gallons: ");
        double gallons = 0;
        try {
            gallons = scanner.nextDouble();
            scanner.nextLine();
            double liters = gallons * LIT_TO_GAL;
            System.out.printf("%.2f gallons is %.2f liters\n", gallons, liters);
        } catch(InputMismatchException e) {
            System.out.println("Invalid number");
        }

    }
}
