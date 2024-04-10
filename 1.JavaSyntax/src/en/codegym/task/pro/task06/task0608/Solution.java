package en.codegym.task.pro.task06.task0608;

/* 
A cube calculator
*/

public class Solution {
    public static void main(String[] args) {
        System.out.println(cube(2)); // 8
    }

    public static long cube(long val) {
        return (long)Math.pow(val, 3);
    }
}
