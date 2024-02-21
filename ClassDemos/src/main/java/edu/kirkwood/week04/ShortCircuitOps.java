package edu.kirkwood.week04;

public class ShortCircuitOps {
    public static void main(String[] args) {
        int numerator = 10;
        int denominator = 0;
        // Short-circuit && means if the first expression is false, don't evaluate the second expression
        if(denominator != 0 && numerator % denominator == 0) {
            System.out.println(denominator + " is a factor of " + numerator);
        }

        String dayOfWeek = "Saturday";
        // Short-circuit || means if the first expression is true, don't evaluate the second expression
        if(dayOfWeek.equals("Saturday") || dayOfWeek.equals("Sunday")) {
            System.out.println("It's the weekend!");
        }


        int num = 21;
        // Is the number between 10 and 20?
        if(num >= 10 && num <= 20) {
            System.out.println("the number is between 10 and 20");
        } else {
            System.out.println("the number is NOT between 10 and 20");
        }
        
        // Is the number NOT between 10 and 20?
        if(!(num >= 10 && num <= 20)) {
            System.out.println("the number is NOT between 10 and 20");
        } else {
            System.out.println("the number is between 10 and 20");
        }

        // Is the number NOT between 10 and 20?
        if(num < 10 || num > 20) {
            System.out.println("the number is NOT between 10 and 20");
        } else {
            System.out.println("the number is between 10 and 20");
        }


    }
}
