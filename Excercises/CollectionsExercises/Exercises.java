package com.company.Week3.CollectionsExercises;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Exercises {

    public static void main(String[] args) {
        System.out.println("\n1. Write a Java program to append the specified element to the end of a linked list.");
        Exercise1 ex1 = new Exercise1();

    }
}

// 1. Write a Java program to append the specified element to the end of a linked list.

class Exercise1 {
    //fields
    private boolean stop = false;
    public Exercise1() {
        // runs appendName
        appendName();
    }

    //create a method that will ask user to append:
    public void appendName() {
        int i = 0;
        ArrayList<String> names = new ArrayList<>();
        System.out.println("Enter a Name(s): type and enter stop to stop.");
        UserInput input = new UserInput();
        do {
            System.out.print((i += 1) + ". ");
            names.add(input.UserInput());

        } while (!names.contains("stop"));

        if (names.contains("stop")) { //strip out stop
            names.remove("stop");
        }

        System.out.println(names);
        new Exercise2(names); //gives exercise2 the list.
        new Exercise3(names);
        new Exercise4(names);
        new Exercise5(names);
    }
}

class Exercise2 {
    // 2. Write a Java program to iterate through all elements in a linked list.
    public Exercise2(List ex1) {
        System.out.println("\n2. Write a Java program to iterate through all elements in a linked list.");
        Iterator ex2 = ex1.iterator();
        while(ex2.hasNext()) {
            System.out.println(ex2.next());
        }
    }
}

//Write a Java program to iterate through all elements in a linked list starting at the
// specified position.
class Exercise3{
    //fields
    private int startFrom = 0;
    //construct
    public Exercise3(List ex1){
        System.out.println("\n3. Please enter the location in the List you wish to start (0-" + (ex1.size()-1) + ")");
        UserInput user = new UserInput();
        startFrom = user.UserInputInt();
        if (startFrom >= 0 || startFrom <= (ex1.size()-1)) {
            while (startFrom < ex1.size()) {
                System.out.println(ex1.get(startFrom++));
            }
        }
    }
}

//4. Write a Java program to iterate a linked list in reverse order.
class Exercise4{
    //fields
    private int startFrom;
    //constructor
    public Exercise4(List ex1) {
        System.out.println("\n4. Write a Java program to iterate a linked list in reverse order.");
        reversePrint(ex1);
    }
    //methods
    protected void reversePrint(List ex1) {
        startFrom = ex1.size()-1;
        while (startFrom >= 0) {
            System.out.println(ex1.get(startFrom--));
        }
    }
}

//5. Write a Java program to insert the specified element at the specified
// position in the linked list.
class Exercise5 {
    //fields
    String name;
    int i = 0;
    //constructor
    public Exercise5(List ex1) {
        UserInput newName = new UserInput();
        System.out.println("\n5. Write a Java program to insert the specified element at the specified position in the linked list.");

        System.out.println("Enter the new name:");
        name = newName.UserInput();

        System.out.println("Select the number you wish to insert your new name into:");
        //print out the List with their numbers
        Iterator it = ex1.iterator();
        while (it.hasNext()){
            System.out.print(++i + ". " + it.next() + " ");
        }
        //reuse i;
        System.out.println("Enter number:");
        i = newName.UserInputInt()-1;
        ex1.add(i, name); // adding the name to the ith location.


        //insert new location
        System.out.println("The new list: ");
        System.out.println(ex1);
    }
}

class UserInput {
    private String message;
    private int number;

    //method
    protected String UserInput() {
        //create scan object
        Scanner scan = new Scanner(System.in);

        //get a user input.
        message = scan.nextLine();
        return message;
    }

    public int UserInputInt() {
        //create scan object
        Scanner scan = new Scanner(System.in);

        //get a user input.
        number = scan.nextInt();
        return number;
    }
}
