package edu.kirkwood.week05;

import java.util.Scanner;

public class Quiz16 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Name: ");
        String name = scanner.nextLine();
        for(int i = 0; i < name.length(); i++) {
            for(int j = 0; j < i + 1; j++) {
                System.out.print(name.charAt(i));
            }
            System.out.println();
        }
    }
}
