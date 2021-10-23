package com.blp.functionalprograms;

import java.util.Scanner;

/**
 * Create 2D Array
 */
public class Array2D {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Rows and Cols");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        Array2D obj = new Array2D(); //Create object to call method
        obj.create(rows,cols); //Call method to print 2D array
    }

    private void create(int rows, int cols) {
        int[][] arr = new int[rows][cols];
        for (int i=0;i<= arr.length-1;i++){
            for (int j=0;j<= arr[i].length-1;j++){
                    arr[i][j]= 5;
                System.out.print(arr[i][j] + " "+" ");
            }
            System.out.println();
        }
    }
}
