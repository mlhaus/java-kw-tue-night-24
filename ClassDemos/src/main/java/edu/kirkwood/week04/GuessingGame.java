package edu.kirkwood.week04;

import edu.kirkwood.shared.Helpers;

import java.util.Objects;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        String answer = (char)Helpers.randint(65, 90) + "";
        System.out.println("I'm thinking of a letter between A and Z.");
        System.out.print("Can you guess it? ");
        Scanner scanner = new Scanner(System.in);

//        while(true) {  // Use while if you don't know how to attempts to allow
        // Use for loop when you want to specify the number of attempts
        int count;
        int attempts = 6;
        for(count = 0; count < attempts; ) {
            String guess = scanner.nextLine();
            count++;
            if (guess.equalsIgnoreCase(answer)) {
                System.out.println("Correct! You got it in " + count + (count == 1 ? " guess." : " guesses."));
                break;
            } else {
                if (guess.compareToIgnoreCase(answer) < 0) {
                    System.out.print("You guessed too low. ");
                } else {
                    System.out.print("You guessed too high. ");
                }
                int remaining = (attempts - count);
                System.out.println("You have " + remaining + (remaining != 1 ? " attempts" : " attempt") + " remaining.");
            }
        }
        if(count == 6) {
            System.out.println("Sorry, the correct letter was " + answer + ".");
        }
        // To do: Save the users score and compare it to other scores
    }
}
