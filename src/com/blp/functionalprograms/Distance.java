package com.blp.functionalprograms;

import java.util.Scanner;

/**
 * Calculate Distance Between Origin to Point
 * Use Formula, Distance = sqrt(x*x + y*y).
 */
public class Distance {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Use Scanner to Read Integer
        System.out.println("Enter x and y integer");
        int x = sc.nextInt();
        int y = sc.nextInt();
        distanceCalculation(x, y);  // Call method to calculate distance
    }

    private static void distanceCalculation(int x, int y) {
        Double d = (Double) Math.floor(Math.sqrt((Math.pow(x, 2)) + (Math.pow(y, 2))));
        System.out.println("Distance = " + d);
    }
}

