package edu.kirkwood.week05;

import java.util.Scanner;

public class WhileDemo {
    public static void main(String[] args) {
//        i = 1
//        while i < 11:
//          print(i, end=" ")
//          i += 2
//        print()
        int i = 1;
        while(i < 11) {
            System.out.print(i + " ");
            i += 2;
        }
        System.out.println();


        // Compute integer powers of 2.
        int e;
        int result;
        for (i = 0; i < 5; i++) {
            result = 1;
            e = i;
            while (e > 0) {
                result *= 2;
                e--;
            }
//            result = (int)Math.pow(2, i);

            System.out.println("2 to the " + i + " power is " + result);
        }

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter 1 or more numbers [S to Stop]:");
        while(true) {
            String val = scanner.nextLine();
            if(val.equalsIgnoreCase("s")) {
                break;
            }
        }
        System.out.println("Goodbye");

        System.out.println("Enter 1 or more numbers [S to Stop]:");
        String val;
        do {
            val = scanner.nextLine();
        } while(!val.equalsIgnoreCase("s"));
        System.out.println("Goodbye");
        
    }
}
