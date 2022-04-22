package com.company.Week2.Day4.exercise;

import java.util.*;

/*
    * 1. Program with try and catch & finally block
        *    create a program that takes input
        *    use try and catch to see if it's a string vs number
 */

public class Exercise1 {
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
        } catch (NullPointerException ex) {
            System.out.println(ex + "Null String!");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
