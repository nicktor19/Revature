package com.company.Week2.Day4.exercise;

import java.util.Locale;
import java.util.Scanner;

public class Text {
    public static void main(String[] args) {
        String str = "Hello";

        Scanner scan = new Scanner(System.in);
        System.out.println("Type Hello for true");

        String text = scan.nextLine();

        System.out.println(str.equals(text));
        System.out.println(text);

    }
}
