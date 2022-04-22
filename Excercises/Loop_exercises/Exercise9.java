package com.company.Week1.Day1;

public class Exercise9 {
    //exercise 9: Write a program in Java to make such a pattern like a pyramid with a number which will repeat the number in the same row.
    //
    //       1
    //      2 2
    //     3 3 3
    //    4 4 4 4

    public static void main(String[] args) {

        for (int row = 1; row <= 4; row++) {

            for (int i = row; i < 4; i++) { //spaces
                System.out.print(" ");
            }
            for (int j = 1; j <= row; j++) { //print number
                System.out.print(" " + row); // add one so that it starts and prints at 1 instead of zero
            }
            System.out.println(); // next line
        }

    }
}
