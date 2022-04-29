package com.company.Week1.Day1;

public class Exercise1 {
    //exercise 1:
    //*
    //**
    //***
    //****
    //*****

    public static void main(String[] args) {
        int rows = 6; // set how many rows to determine

        for(int i = 0; i < rows; i++) { // sets the row
            for (int l = 0; l < i; l++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
