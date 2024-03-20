package edu.kirkwood.week05;

import java.util.Scanner;

public class SqrRoot {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        // Loop until an S is typed.
        System.out.println("Press S to stop.");
        for (int i = 0; !scanner.nextLine().equalsIgnoreCase("S"); i++)
            System.out.println(" - Pass #" + i);
        System.out.println();
        



        double sroot, rerr;

        for (int num = 1; num < 10; num++) {
            sroot = Math.sqrt(num);
            System.out.println("Square root of " + num + " is " + sroot);

            // compute rounding error
            rerr = num - (sroot * sroot);
            System.out.println("Rounding error is " + rerr);
            System.out.println();
        }
    }
}
