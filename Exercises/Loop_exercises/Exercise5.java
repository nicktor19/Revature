package com.company.Week1.Day1;

public class Exercise5 {
    //exercise 5:
    //     *
    //    **
    //   ***
    //  ****
    //******

        public static void main(String[] args) {
            int rows = 6; // set how many rows to determine

            for(int i = 0; i < rows; i++) { // sets the row

                //print out space before star:
                for (int space = rows-i-1; space > 0; space--) {
                    System.out.print(" ");
                }
                for (int l = 0; l < i; l++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
}
