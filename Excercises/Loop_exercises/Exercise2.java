package com.company.Week1.Day1;

public class Exercise2 {
    //exercise 2:
    //*****
    //****
    //***
    //**
    //*
    public static void main(String[] args) {
        int rows = 5;
        //print out rows its inverse so the results need to be a star.
        for (int r = 0; r < rows; r++) {
            System.out.print(" ");
            for (int l = rows; l > r; l--) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
