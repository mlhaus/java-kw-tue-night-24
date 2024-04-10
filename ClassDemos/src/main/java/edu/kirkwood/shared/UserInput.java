package edu.kirkwood.shared;

import java.time.Instant;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class UserInput {

    public static int getInt(String prompt, Scanner scanner) {
        return getInt(prompt, scanner, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    public static int getInt(String prompt, Scanner scanner, int min) {
        return getInt(prompt, scanner, min, Integer.MAX_VALUE);
    }
    public static int getInt(String prompt, Scanner scanner, int min, int max) {
        int result = 0;
        String minMax = ""; // format a min/max prompt
        // Check if min parameter is set
        if(min != Integer.MIN_VALUE && max == Integer.MAX_VALUE) {
            minMax = String.format(" [min %d]", min);
        }
        // Check if min and max are set
        else if(min != Integer.MIN_VALUE && max != Integer.MAX_VALUE) {
            minMax = String.format(" [between %d and %d]", min, max);
        }
        while(true) {
            System.out.print(prompt + minMax + ": ");
            // try-catch block
            try {
                String resultStr = scanner.nextLine();
                result = Integer.parseInt(resultStr);
                if(result < min) {
                    UIUtility.displayWarning("Value too low");
                } else if(result > max) {
                    UIUtility.displayWarning("Value too high");
                } else {
                    break;
                }
            } catch (NumberFormatException e) {
                UIUtility.displayMessage("Invalid integer");
            }
        }
        return result;
    }

    public static String getString(String prompt, Scanner scanner) {
        return getString(prompt, scanner, false);
    }

    public static String getString(String prompt, Scanner scanner, boolean required) {
        String result = "";
        while(true) {
            System.out.print(prompt + (required ? " *" : "") + ": ");
            result = scanner.nextLine().trim();
            if(required && !Helpers.isValidString(result)) {
                UIUtility.displayWarning("Input required");
            } else {
                break;
            }
        }
        return result;
    }

    public static boolean getBoolean(String prompt, Scanner scanner) {
        String answer = "";
        while(true) {
            answer = getString(prompt + " [yes, no]", scanner);
            if(answer.equalsIgnoreCase("yes") ||
                    answer.equalsIgnoreCase("y") ||
                    answer.equalsIgnoreCase("no") ||
                    answer.equalsIgnoreCase("n")) {
                break;
            } else {
                UIUtility.displayMessage("Invalid input");
            }
        }
        return answer.equalsIgnoreCase("yes") ||
                answer.equalsIgnoreCase("y");
    }

    public static LocalDate getDate(String prompt, Scanner scanner) {
        LocalDate result = LocalDate.now();
        while(true) {
            String answer = getString(prompt + " [MM/DD/YYYY]", scanner);
            result = Helpers.getDateFromString(answer);
            if(result == null) {
                UIUtility.displayMessage("Invalid date");
            } else {
                break;
            }
        }
        return result;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(getString("Middle name", scanner));
        System.out.println(getString("First name", scanner, true));
        System.out.println(getInt("Current temperature", scanner));
        int deposit = getInt("Deposit", scanner, 0);
        String depositUSD = Helpers.toCurrency(deposit);
        System.out.println(depositUSD);
        System.out.println(getInt("Number of beds", scanner, 0, 4));
        System.out.println(getBoolean("Handicap accessible", scanner));
        LocalDate date = getDate("Check in date", scanner);
        System.out.println(Helpers.formatDate(date));
    }
}
