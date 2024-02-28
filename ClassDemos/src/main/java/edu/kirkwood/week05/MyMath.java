package edu.kirkwood.week05;

import edu.kirkwood.shared.Helpers;

import java.util.Scanner;

public class MyMath {
    public static void main(String[] args) {
//        import math
//        import random
//        print(math.pi)
        System.out.println(Math.PI);
//        print(math.fabs(-1)) #absolute value
        System.out.println(Math.abs(-1));
//        print(math.ceil(1.23))
        System.out.println(Math.ceil(1.23));
//        print(math.floor(1.23))
        System.out.println(Math.floor(1.23));
//        print(round(1.23, 1))
        System.out.println(Math.round(1.23)); // DON'T USE THIS
        System.out.println(Helpers.round(1.23, 1));
//        print(min(8, 1, 9))
        System.out.println(Math.min(8, 1));
//        print(max(8, 1, 9))
        System.out.println(Math.max(8, 1));
//        print(math.pow(2, 3))
        System.out.println(Math.pow(2, 3));
//        print(random.random())
        System.out.println(Math.random());
//        print(math.sqrt(16))
        System.out.println(Math.sqrt(16));
//        print(math.hypot(3, 4))
        System.out.println(Math.hypot(3, 4));

        Scanner scanner = new Scanner(System.in);
        System.out.println("Volume of a cylinder");
        System.out.print("Radius: ");
        double radius = scanner.nextDouble();
        System.out.print("Height: ");
        double height = scanner.nextDouble();
        double volume = Math.PI * Math.pow(radius, 2) * height;
        System.out.printf("Volume \u2248 %.2f", volume);
    }
}
