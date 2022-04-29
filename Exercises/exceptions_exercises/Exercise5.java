package com.company.Week2.Day4.exercise;

/*
* 5. Program to create custom exception
*/
import java.util.Scanner;

public class Exercise5 {
    public static void main(String[] args) {
        Exercise5 newObject = new Exercise5(); // instantiate the class to an object so that i can access input whose not a static.

        try {
            newObject.input(); //calling input through the newly created object.
        } catch (NotNumber e) { // if the input throws back an exception than it will catch it
            System.out.println(e.getMessage()); //here the error message is than printed.
        }
    }

    //method for class to scan:
    public void input() throws NotNumber{
        Scanner scan = new Scanner(System.in);//created a scanner to get user input
        System.out.println("Type your fav number:"); // friendly message as to what to enter.
        if (scan.hasNextInt()) { // this will prompt the user to enter something from console. if not a number go to else.
            System.out.println("int"); // if int than print out int
        } else {
            throw new NotNumber("Not an int"); // throw p the new object exception to the calling object.
        }
    }

}

class NotNumber extends Exception {
    //constructs
    public NotNumber() {
        System.out.println("Not a number");
    }
    public NotNumber(String message) {
        super(message);
    }
}