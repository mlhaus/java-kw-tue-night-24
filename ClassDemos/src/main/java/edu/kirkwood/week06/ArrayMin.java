package edu.kirkwood.week06;

import org.apache.commons.lang3.ArrayUtils;

import java.util.*;

public class ArrayMin {
    public static int[] array;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        array = new int[num];
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
            min = Math.min(min, array[i]);
        }

        // Source https://stackoverflow.com/a/1486010
        // Written by: Michael Rutherford
        List b = Arrays.asList(ArrayUtils.toObject(array));
        System.out.println(Collections.min(b));
        // source https://stackoverflow.com/a/30692454
        // Written by: Ortomala Lokni in 2015
        min = Arrays.stream(array).min().getAsInt();
        System.out.println(min);
        // Written by: Ortomala Lokni in 2017
        IntSummaryStatistics stat = Arrays.stream(array).summaryStatistics();
        min = stat.getMin();
        System.out.println(min);
    }
}
