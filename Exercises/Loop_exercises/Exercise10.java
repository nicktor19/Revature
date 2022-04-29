package com.company.Week1.Day1;

public class Exercise10 {
    //exercise 10: Write a program in Java to display the pattern like a diamond.
    //
    //Test Data
    //Input number of rows (half of the diamond) : 7
    //Expected Output :
    //
    //
    //      *
    //     ***
    //    *****
    //   *******
    //  *********
    // ***********
    //*************
    // ***********
    //  *********
    //   *******
    //    *****
    //     ***
    //      *

    public static void main(String[] args) {
        // because the rows input is at 7 we can go from + 7 and back down to zero.
        // seven will be the absolute middle of both axis.
        int rows= 7;
        int test = 6;
        int test2 = 5;

        //top of diamond
        for (int row = 1; row <= rows; row++) {
            //top half
            for (int t = row; t < rows; t++) { // get the top left spaces
                System.out.print(" ");
            }
            for (int t = 1; t < row; t++) {
                System.out.print("*");
            }
            for (int t = 1; t <= row; t++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (int row = 1; row <= (rows-1); row++) {
            //top half
            for (int t = 1; t <= row; t++) { // get the top left spaces
                System.out.print(" ");
            }
            for (int t = test; t >= 1; t--) {
                    System.out.print("*");
            }
            test--;
            for (int t = (test2); t >= 1; t--) {
                System.out.print("*");
            }
            test2--;
            System.out.println();
        }

    }
}