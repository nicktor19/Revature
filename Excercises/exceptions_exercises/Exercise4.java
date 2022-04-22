package com.company.Week2.Day4.exercise;

import java.util.Scanner;

public class Exercise4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number 1: else Error");

        try {
            one(scan.nextInt());
        } catch (Exception e) {
            System.out.println("You didn't enter a valid number! " + e.getMessage());
        }

    }

    //methods
    public static void one(int num) throws Exception {
        if (num == 1) {
            System.out.println("Looks good " + num);
            two(num);
        }else {
            two(num);
        }
    }
    public static void two(int num) throws Exception {
        System.out.println("Get the sum of 2: Your at " + num + " + ?");
        Scanner scan = new Scanner(System.in);
        num += scan.nextInt();
        if (num == 2) {
            System.out.println("You must be the instructor.");
        } else {
            three();
        };

    }

    public static void three() throws Exception{
        throw new Exception("You're out of bounds with numbers");
    }
}
