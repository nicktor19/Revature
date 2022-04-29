package com.company.Week1.Day1;

public class Exercise6 {

    //exercise 6:Take three numbers from the user and print the greatest number
    //
    //Test Data
    //Input the 1st number: 25
    //Input the 2nd number: 78
    //Input the 3rd number: 87
    //Expected Output :
    //The greatest: 87

    public static void main(String[] args) {
        int input1 = 25, input2 = 78, input3= 87;
        int greatest;
        System.out.print("The Greatest: ");
        if (input1 > input2 && input1 > input3)
            System.out.println(input1);
        else if (input2 > input1 && input2 > input3)
            System.out.println(input2);
        else if (input3 > input1 && input3 > input2)
            System.out.println(input3);
        else
            System.out.println("Something went wrong. Maybe there was a Tie.");
    }
}
