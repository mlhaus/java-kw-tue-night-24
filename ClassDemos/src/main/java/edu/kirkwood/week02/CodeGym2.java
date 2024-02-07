package edu.kirkwood.week02;

public class CodeGym2 {
    public static void main(String[] args) {
        int num = 5;
        System.out.println(num / 2); // 2 - quotient
        System.out.println(num / 2.0); // 2.5
        System.out.println(num % 2); // 1 - remainder

        num = 19;
        System.out.println(num / 10); // 1
        System.out.println(num / 10.0); // 1.9
        System.out.println(num % 10); // 9

        num = 123;
        System.out.println(num % 10);  // 3
        num = num + 1;
        num += 1;
        num++;
        System.out.println(num);
        System.out.println("My favorite number is " + num + "!");
        System.out.printf("My favorite number is %d!\n", num);
        System.out.printf("%s %s\n", num, num);
    }
}
