package edu.kirkwood.week01;

import java.io.PrintStream;

/*
   This demonstrates a variable.
   Call this file "Example2.java".
*/
public class Example2 {
    public static void main(String[] args) {
        // From Beginner's Guide
        int myVar1; // declare a variable
        myVar1 = 5; // assign a value
        int myVar2 = myVar1 / 2;
        System.out.println(myVar2); // Prints 2 (an int), because I'm dividing an int by an int
        double myVar3 = myVar1 / 2.0;
        System.out.println(myVar3); // Prints 2.5 (a double), because I'm dividing an int by a double
        // myVar1 = "Ten"; // Java is a strictly-typed language, this code is invalid

        int age = 22;
        System.out.println("I am " + age + " years old and my favorite number is " + myVar1 + ".");
        System.out.printf("I am %s years old and my favorite number is %s.\n", age, myVar1);
        System.out.println(String.format("I am %s years old", age));

        double x = 3.44;
        float y = 3.44f;

        long z = 10;
//        byte a = 128;


        // From Complete Reference
        int num; // this declares a variable called num
        num = 100; // this assigns num the value 100
        System.out.println("This is num: " + num);
        num = num * 2;
        System.out.print("The value of num * 2 is ");
        System.out.println(num);
    }
}