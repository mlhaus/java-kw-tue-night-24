package edu.kirkwood.week04;

import edu.kirkwood.shared.Helpers;

import java.util.Objects;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int lowest = Integer.MAX_VALUE;
        int count;
        outer: while(true) {
            String answer = (char)Helpers.randint(65, 90) + "";
            System.out.println(answer);
            System.out.println("I'm thinking of a letter between A and Z.");
            int attempts = 6;
            boolean correct = false;
            inner:
            for (count = 0; count < attempts; ) {
                System.out.print("Guess: ");
                String guess = scanner.nextLine();
                count++;
                if (guess.equalsIgnoreCase(answer)) {
                    System.out.println("Correct! You got it in " + count + (count == 1 ? " guess." : " guesses."));
                    correct = true;
                    break inner;
                } else {
                    if (guess.compareToIgnoreCase(answer) < 0) {
                        System.out.print("You guessed too low. ");
                    } else {
                        System.out.print("You guessed too high. ");
                    }
                    System.out.println("You have " + (attempts - count) + " attempts remaining.");
                }
            }
            if (!correct) {
                System.out.println("Sorry, the correct letter was " + answer + ".");
            }
            if(count < lowest) {
                lowest = count;
                System.out.println("You got your best score");
            }
            System.out.print("Press Q to quit.");
            String quit = scanner.nextLine();
            if(quit.equalsIgnoreCase("q")) {
                break outer;
            }
        }
        System.out.println("Your best score was " + lowest);
    }
}
