package en.codegym.task.pro.task04.task0409;

import java.util.InputMismatchException;
import java.util.Scanner;

/* 
Minimum of entered numbers
*/

public class Solution {
    public static void main(String[] args) {
        //write your code here
        Scanner scanner = new Scanner(System.in);
        int min = Integer.MAX_VALUE;
        while(true) {
            try {
                int val = scanner.nextInt();
                min = Math.min(val, min);
            } catch(InputMismatchException e) {
                break;
            }
        }
        System.out.println(min);
    }
}