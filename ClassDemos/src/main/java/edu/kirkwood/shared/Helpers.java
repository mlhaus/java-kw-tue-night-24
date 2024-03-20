package edu.kirkwood.shared;

import java.text.DecimalFormat;
import java.util.Random;

public class Helpers {
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
