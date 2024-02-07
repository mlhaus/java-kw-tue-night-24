package edu.kirkwood.shared;

import java.text.DecimalFormat;

public class Helpers {
    public static String round(double num, int numDecimalPlaces) {
        String result = ""; // Step 1: Declare a variable to be returned
        DecimalFormat decimalFormat = new DecimalFormat("0.#"); // Step 3: Call the DecimalFormat class constructor
        // Step 4: The constuctor will instantiate an object, assign the object to a variable.
        decimalFormat.setMaximumFractionDigits(numDecimalPlaces); // Step 5: Call the decimalFormat object's non-static method, passing the numDecimalPlaces parameter
        result = decimalFormat.format(num); // Step 6: Call the decimalFormat object's non-static format method, passing the num parameter. Assign the result to a String variable
        return result; // Step 2: Return the result variable
    }
}
