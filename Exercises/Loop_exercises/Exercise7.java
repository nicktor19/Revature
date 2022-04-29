package com.company.Week1.Day1;

public class Exercise7 {
    //exercise 7: Write a program in Java to display the multiplication table of a given integer.
    //
    //Test Data
    //Input the number (Table to be calculated) : Input number of terms : 5
    //Expected Output :
    //
    //5 X 0 = 0
    //5 X 1 = 5
    //5 X 2 = 10
    //5 X 3 = 15
    //5 X 4 = 20
    //5 X 5 = 25

    public static void main(String[] args) {
        //Input the number (Table to be calculated)
        int x = 5;
        //Input number of terms
        int terms = 5;

        for (int i = 0; i <= terms; i++) {
            //output
            System.out.print(x + " X " + i + "= ");
            System.out.println(x*i);
        }

    }
}
