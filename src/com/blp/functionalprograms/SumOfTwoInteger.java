package com.blp.functionalprograms;

import java.util.Scanner;

/**
 * Sum Of Two Integer Adds to Zero
 */
public class SumOfTwoInteger {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter numbers count");
        int n = sc.nextInt();
        int[] numberArray = new int[n];
        System.out.println("Enter numbers now");
        // Take an Array and give it values
        for (int i = 0; i < n; i++) {
            numberArray[i] = sc.nextInt();
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int k = j + 1; k < n; k++) {
                    if (numberArray[i] + numberArray[j] + numberArray[k] == 0) {
                        count = count + 1;
                        System.out.println("(" + numberArray[i] + " " + numberArray[j] +
                                " " + numberArray[k] + ")");
                    }
                }
            }
        }
        System.out.println("Number of combination found is : " + count);
    }
}
