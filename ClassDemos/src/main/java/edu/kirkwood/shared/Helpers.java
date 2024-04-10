package edu.kirkwood.shared;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.time.format.FormatStyle;
import java.util.Locale;
import java.util.Random;

public class Helpers {
    public static final DateTimeFormatter DATE_INPUT_FORMAT = DateTimeFormatter.ofPattern("M/d/yyyy", Locale.ENGLISH);
    public static final DateTimeFormatter DATE_OUTPUT_FORMAT = DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL);

    /**
     * Determines if a string is a valid date
     * @param date a String representing a possible date
     * @return a boolean, true if the String matches the date regular expression
     */
    public static boolean isValidDate(String date) {
        return Validators.datePattern.matcher(date).matches();
    }

    public static String formatDate(LocalDate date) {
        return date.format(DATE_OUTPUT_FORMAT);
    }

    public static LocalDate getDateFromString(String date) {
        if(isValidDate(date)) {
            try {
                return LocalDate.parse(date, DATE_INPUT_FORMAT);
            } catch(DateTimeParseException e) {
                return null;
            }
        }
        return null;
    }

    public static boolean isTodayOrFuture(LocalDate date) {
        return !date.isBefore(LocalDate.now());
    }

    public static boolean areDatesInOrder(LocalDate date1, LocalDate date2) {
        return date1.compareTo(date2) <= 0;
    }

    public static LocalDate addDays(LocalDate date, int numDays) {
        return date.plusDays(numDays);
    }

    public static boolean isValidString(String str) {
        return str != null && !str.equals("");
    }

    public static boolean isNumeric(String str) {
        return str.matches("[0-9]+");
    }

    public static String toCurrency(double amt) {
        NumberFormat formatter = NumberFormat.getCurrencyInstance();
        return formatter.format(amt);
    }


    /**
     * Formats a double value to a string with a specified number of decimal places.
     * @param num The double value to be formatted 
     * @param numDecimalPlaces The desired number of decimal places
     * @return A string representation of the formatted number
     */
    public static String round(double num, int numDecimalPlaces) {
        String result = ""; // Step 1: Declare a variable to be returned
        DecimalFormat decimalFormat = new DecimalFormat("0.#"); // Step 3: Call the DecimalFormat class constructor
        // Step 4: The constuctor will instantiate an object, 
        // assign the object to a variable.
        decimalFormat.setMaximumFractionDigits(numDecimalPlaces); // Step 5: Call the decimalFormat object's non-static method, passing the numDecimalPlaces parameter
        result = decimalFormat.format(num); // Step 6: Call the decimalFormat object's non-static format method, passing the num parameter. Assign the result to a String variable
        return result; // Step 2: Return the result variable
    }

    /**
     * To generate a random number between 2 values.
     * @param min an int, smallest possible value
     * @param max an int, largest possible value
     * @return an int between min and max
     */
    public static int randint(int min, int max) {
        // I asked ChatGPT for help
        Random random = new Random();
        int rand = random.nextInt(max - min + 1) + min;
        return rand;
    }
}
