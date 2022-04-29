package com.company.Week2.Day4.exercise;

/* * 2. Program for multiple catch with single try
 *    same thing as exercise 1 just add another catch block */

import java.util.Scanner;

public class Exercise2 {
    public static void main(String[] args) {
        final String good = "GOOD";
        String text;
        Scanner scan = new Scanner(System.in);

        System.out.println("Type in 1 for no error!");
        int num = scan.nextInt();

        switch (num) {
            case 1:
                text = "GOOD";
                System.out.println(text);
                break;
            default:
                text = null;

        }
        try {
            good.compareTo(text);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
