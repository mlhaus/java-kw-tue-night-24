package edu.kirkwood.week05;

import java.util.Scanner;

public class Casting {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
//        age = int(input("What is your age? "))
        System.out.print("What is your age? ");
        int age = Integer.valueOf(scanner.nextLine());
//        age += 1
        age++;
//        print(f"You will be {age} years old next year")
        System.out.printf("You will be %d years old next year\n", age);
//        age2 = float(age)
        double age2 = age;
//                print(age2)
        System.out.println(age2);
//        age3 = int(age2)
        int age3 = (int)age2;
//                print(age3)
        System.out.println(age3);


        long L;
        double D;

        L = 1001232859999L;
        D = L; // long can be assigned to double
        System.out.println(D);

        L = (long)D; // double cannot be assigned to long without casting
        System.out.println(L);


        int x, y;
        double i;

        x = 10;
        y = 3;

        i = (double)x / y; // cast double to int
        System.out.println("Integer outcome of x / y: " + i);

        for(int j = 0; j < 5; j++) {
            System.out.println(j + " / 3: " + j / 3);
            System.out.println(j + " / 3 with fractions: "
                    + (double) j / 3);
            System.out.println();
        }
    }
}
