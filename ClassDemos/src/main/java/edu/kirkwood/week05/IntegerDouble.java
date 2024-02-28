package edu.kirkwood.week05;

import java.math.BigInteger;
import java.util.Scanner;

public class IntegerDouble {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        System.out.println("Enter 5 integers:");
        for(int i = 0; i < 5; i++) {
            int val = scanner.nextInt();
            scanner.nextLine(); // read enter key press
            min = Integer.min(val, min);
            max = Integer.max(val, max);
        }
        System.out.printf("Min: %d, Max: %d\n", min, max);


        System.out.println(Byte.MIN_VALUE + " to " + Byte.MAX_VALUE);
        System.out.println(Short.MIN_VALUE + " to " + Short.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE + " to " + Integer.MAX_VALUE);
        System.out.println(Long.MIN_VALUE + " to " + Long.MAX_VALUE);
        System.out.println(Float.MIN_VALUE + " to " + Float.MAX_VALUE);
        System.out.println(Double.MIN_VALUE + " to " + Double.MAX_VALUE);
        BigInteger reallyBigNumber = BigInteger.valueOf(999999999999999999L);


        System.out.print("Enter your zip code: ");
        String zip = scanner.nextLine();
        System.out.printf("Your zip code is %s\n", zip);
        int zipInt = Integer.valueOf(zip);
        System.out.printf("Your zip code is %d\n", zipInt);
        double zipDbl = Double.valueOf(zip);
        System.out.printf("Your zip code is %.0f\n", zipDbl);
        String zip2 = String.valueOf(zipInt);
        System.out.printf("Your zip code is %s\n", zip2);
    }
}
