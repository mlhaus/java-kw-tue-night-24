package en.codegym.task.pro.task04.task0403;

import java.util.Scanner;

/* 
Summation
*/

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while(true) {
            String val = scanner.nextLine();
            if(val.equalsIgnoreCase("ENTER")) {
                break;
            }
            int val2 = Integer.parseInt(val);
            sum += val2;
        }
        System.out.println(sum);
    }
}