package com.company.Week1.Day1;

public class Exercise8 {
    //exercise 8: Write a program in Java to display the pattern like right angle triangle with a number.
    //
    //Test Data
    //Input number of rows : 10
    //Expected Output :
    //
    //1
    //12
    //123
    //1234
    //12345
    //123456
    //1234567
    //12345678
    //123456789
    //12345678910

    public static void main(String[] args) {
        int rows = 10;

        for (int i = 1; i <= rows; i++) { // rows
            for (int num = 1; num <= i; num++) {
                System.out.print(num);
            }
            System.out.println();
        }
    }
}
