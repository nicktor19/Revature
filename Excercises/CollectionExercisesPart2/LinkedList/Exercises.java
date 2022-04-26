package com.company.Week3.Day1.CollectionExercisesPart2.LinkedList;

import java.util.LinkedList;
import java.util.Scanner;

public class Exercises {
    public static void main(String[] args) {
        System.out.println("Select one Exercise 1-5: OR enter anything to exit:");
        switch (UserInput.inputNumber()) {
            case 1:
                new Exercise1(); // 1. Write a Java program to append the specified element to the end of a linked list.
                break;
            case 2:
                new Exercise2(); // 2. Write a Java program to iterate through all elements in a linked list.
                break;
            case 3:
                new Exercise3(); // 3. Write a Java program to iterate through all elements in a linked list starting at the specified position.
                break;
            case 4:
                new Exercise4(); // 4. Write a Java program to iterate a linked list in reverse order.
                break;
            case 5:
                new Exercise5(); // 5. Write a Java program to insert the specified element at the specified position in the linked list.
                break;
            default:
                break;
        }
    }
}


class Exercise1 {
    //fields

    //constructor
    public Exercise1() {
        System.out.println("1. Write a Java program to append the specified element to the end of a linked list.");
        //create a Linked List to store data into.
        LinkedList<String> names = UserInput.createLinkedList();// get a list
        System.out.println("Before:\n" + names);
        //append to the list.
        System.out.println("Enter a new name to append:");
        names.add(UserInput.inputString()); //append to names
        System.out.println("After :\n" + names);// already appends to the end.
    }
}

//2. Write a Java program to iterate through all elements in a linked list.
class Exercise2{
    //constructor
    private int i = 0;
    public Exercise2() {
        System.out.println("\n2. Write a Java program to iterate through all elements in a linked list.");
        //create and make list:
        LinkedList<String> names = UserInput.createLinkedList(); //get a list
        //iterate
        System.out.println("--- Printout ---");
        for (String n : names ) {
            System.out.println(++i + ". " + n);
        }
    }
}

//3. Write a Java program to iterate through all elements in a linked list starting at the specified position.
class Exercise3{
    //constructor
    public Exercise3() {
        System.out.println("\n3. Write a Java program to iterate through all elements in a linked list starting at the specified position.");
        //make a LinkedList
        LinkedList<String> names = UserInput.createLinkedList();
        echoLinkedListAt(names); // send to method for printing the ith location
    }

    //methods
    protected void echoLinkedListAt(LinkedList x) {
        int i = 0;
        //takes in a Linked List and prints out based on locations specified.
        System.out.println("Please Select a number from 1 - " + x.size());//Print out message to select from
        do {
            i = UserInput.inputNumber(); // get a number greater than 0
        } while (i == 0);

        System.out.println(x.get(i - 1));// print out the ith location of x //subtract 1 from ith.
    }
}

//4. Write a Java program to iterate a linked list in reverse order.
class Exercise4{
    //constructor
    public Exercise4(){
        System.out.println("\n4. Write a Java program to iterate a linked list in reverse order.");
        LinkedList<String> names = UserInput.createLinkedList(); //Instantiate LinkedList
        reverseLinkedList(names);
    }
    //methods
    protected void reverseLinkedList(LinkedList x) {
        System.out.println("Before: " + x);

        System.out.println("Reverse Order: ");
        for (int i = (x.size()-1); i >= 0; i--) {
            System.out.print((i+1) + ". " + x.get(i) + " ");
        }
    }
}

//5. Write a Java program to insert the specified element at the specified position in the linked list.
class Exercise5{
    //constructor
    public Exercise5() {
        System.out.println("\n5. Write a Java program to insert the specified element at the specified position in the linked list.");
        LinkedList<String> names = UserInput.createLinkedList(); //Instantiate Linked List using method
        insertIndexAt(names);//call the method
    }
    //methods
    protected void insertIndexAt(LinkedList x) {
        System.out.print("Before: ");
        for (int i = 0; i < x.size(); i++) {
            System.out.print((i+1) + ". " + x.get(i) + " ");
        }

        System.out.println("\n\nEnter a number (from above) to insert a new name into:");//message user to enter number
        int i = UserInput.inputNumber();
        System.out.println("Enter a name:");
        x.add(i-1, UserInput.inputString());
        System.out.println("New List: " + x);
    }
}

//classes to get user input.
class UserInput {
    //fields

    //methods
    public static String inputString() {
        String str;
        Scanner scan = new Scanner(System.in);
        str = scan.nextLine();
        return str;
    }

    public static int inputNumber() {
        int num;
        Scanner scan = new Scanner(System.in);
        num = scan.nextInt();
        return num;
    }

    public static LinkedList createLinkedList() {
        int i = 0;

        LinkedList<String> names = new LinkedList<>(); //create a LinkedList
        System.out.println("Please enter names:");
        System.out.println("Type stop to end List:");
        do {
            System.out.print(++i + ". ");
            names.add(inputString());
        } while (!names.contains("stop"));
        if (names.contains("stop")) {
            names.remove("stop");
        }
        return names;
    }
}
