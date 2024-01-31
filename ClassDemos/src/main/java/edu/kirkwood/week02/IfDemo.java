package edu.kirkwood.week02;

public class IfDemo {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int c = a - b;
        if (a < b) {
            System.out.println("a is less than b");
        }
        if (c > 0) {
            System.out.println("c is positive");
        } else if (c == 0) {
            System.out.println("c is zero");
        } else {
            System.out.println("c is negative");
        }

    }
}
