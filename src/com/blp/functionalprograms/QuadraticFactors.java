package com.blp.functionalprograms;

import java.util.Scanner;

/**
 * Print Quadratic Factors
 */
public class QuadraticFactors {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  //read the data
        System.out.println("Enter values");
        double num1 = sc.nextInt(),
                num2 = sc.nextInt(),
                num3 = sc.nextInt();
        double roots[] = calculateRoots(num1, num2, num3);  //Method to call for calculating roots
        System.out.println("root1 : " + roots[0] + " and " + "root2 : " + roots[1]);
    }

    private static double[] calculateRoots(double num1, double num2, double num3) {
        double detrm = (num2 * num2) - (4 * num1 * num3);
        double root1 = (-num2 + Math.sqrt(detrm)) / (2 * num1);
        double root2 = (-num2 - Math.sqrt(detrm)) / (2 * num1);
        double roots[] = new double[2];
        roots[0] = root1;
        roots[1] = root2;
        return roots;
    }
}
