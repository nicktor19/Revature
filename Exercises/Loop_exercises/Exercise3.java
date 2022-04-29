package com.company.Week1.Day1;
//exercise 3:
//   *
//  ***
// *****
//*******
public class Exercise3 {
    public static void main(String[] args) {

        for (int r = 0; r < 4; r++) {
            //use case method to make it easier lol.
            switch (r) {
                case 0:
                    System.out.println("   *");
                    break;
                case 1:
                    System.out.println("  ***");
                    break;
                case 2:
                    System.out.println(" *****");
                    break;
                case 3:
                    System.out.println("*******");
                    break;
                }
            }
            System.out.println();
    }

}
