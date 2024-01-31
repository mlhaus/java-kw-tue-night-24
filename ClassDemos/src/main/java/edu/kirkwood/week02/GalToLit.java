package edu.kirkwood.week02;

public class GalToLit {

    private static final double LITERS_PER_GALLON = 3.78541;

    public static void main(String[] args) {
        double gallons;
        double liters;
        for (gallons = 0.5; gallons <= 15; gallons += 0.25) {
            liters = gallons * LITERS_PER_GALLON;
            System.out.printf("%.2f gallons is %.4f liters\n", gallons, liters);
//            System.out.println(gallons + " gallons is " + liters + " liters.");
        }
    }
}
