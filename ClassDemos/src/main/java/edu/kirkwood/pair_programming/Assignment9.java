package edu.kirkwood.pair_programming;

import java.util.Scanner;

public class Assignment9 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Example
        System.out.println("Enter two numbers");
        double num1 = scanner.nextDouble();
        double num2 = scanner.nextDouble();
        double sum = sum(num1, num2);
        System.out.printf(num1 + " + " + num2 + " = " + sum);
        // Task 1

        // Task 2

    }

    /**
     * @param num1 A double
     * @param num2 A double
     * @return The sum of num1 and num2
     */
    public static double sum(double num1, double num2) {
        return num1 + num2;
    }
}
