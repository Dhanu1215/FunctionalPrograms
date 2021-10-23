package com.blp.functionalprograms;

import java.util.Scanner;

/**
 * Windchill, Formula to calculate, W = 35.74 + 0.6215 t + ( 0.4275 t - 35.75 )*v^0.16
 */
public class WindChill {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Use Scanner to Read Values
        System.out.println("Enter values of temperature(t) and wind speed(v)");
        int t = sc.nextInt();
        int v = sc.nextInt();
        int z = calculateWindChill(t, v); // Call method to calculate WindChill(w)
        System.out.println("WindChill = " + z);
    }
    private static int calculateWindChill(int t, int v) {

        int a = (int) Math.floor((35.74 + (0.6215 * t)) + (double) (((0.4275 * t) - 35.75) * Math.floor(Math.pow(v, (double) 0.16))));

        return (int) a;
    }
}
