package en.codegym.task.pro.task04.task0418;

import java.util.Scanner;

/* 
Is the glass half empty or half full?
*/

public class Solution {
    public static void main(String[] args) {
        double glass = 0.5;
        Scanner scanner = new Scanner(System.in);
        boolean halfFull = scanner.nextBoolean();
        if(halfFull) {
            glass = Math.ceil(glass);
        } else {
            glass = Math.floor(glass);
        }
        System.out.println((int)glass);
    }
}