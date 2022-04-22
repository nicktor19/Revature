package com.company.Week1.Day1;

public class Exercise4 {
    //exercise 4:
    //*****
    // ***
    //  *
    //
    public static void main(String[] args) {

        for (int r = 3; r < 4; --r) {
            //use a case method again
            switch (r) {
                case 3:
                    System.out.println("*****");
                    break;
                case 2:
                    System.out.println(" ***");
                    break;
                case 1:
                    System.out.println("  *");
                    break;
                case 0:
                    System.out.println("     ");
                    break;
            }
        }

    }
}
