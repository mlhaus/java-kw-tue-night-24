package edu.kirkwood.week04;

import java.util.Objects;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        String answer = "K"; // To do: randomize the letter
        System.out.println("I'm thinking of a letter between A and Z.");
        System.out.print("Can you guess it? ");
        Scanner scanner = new Scanner(System.in);
        String guess = scanner.nextLine();
        // To do: loop until the user answers correctly
        if(guess.equalsIgnoreCase(answer)) {
            System.out.println("Correct!");
        } else {
            if(guess.compareToIgnoreCase(answer) < 0) {
                System.out.println("You guessed too low");
            } else {
                System.out.println("You guessed too high");
            }
        }
        // To do: Save the users score and compare it to other scores
    }
}
