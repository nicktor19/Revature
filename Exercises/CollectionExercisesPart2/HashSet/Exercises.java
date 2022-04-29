package com.company.Week3.Day1.CollectionExercisesPart2.HashSet;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Scanner;


public class Exercises {

    public static void main(String[] args) {
        HashSet<String> names = UserInput.createHashSet(); // store a Hashset once for rest of programs.
        System.out.println("Select a Program to run: 1-4");
        System.out.println("1. Write a Java program to append the specified element to the end of a hash set.\n" +
                "2. Write a Java program to iterate through all elements in a hash list.\n" +
                "3. Write a Java program to get the number of elements in a hash set.\n" +
                "4. Write a Java program to empty an hash set.");
        switch (UserInput.inputInt()) {
            case 1:
                new Exercise1(names); //1. Write a Java program to append the specified element to the end of a hash set.
                break;
            case 2:
                new Exercise2(names); //2. Write a Java program to iterate through all elements in a hash list.
                break;
            case 3:
                new Exercise3(names);// 3. Write a Java program to get the number of elements in a hash set.
                break;
            case 4:
                new Exercise4(names);// 4. Write a Java program to empty a hashset.
                break;
            default:
                break;
        }
    }
}
//all classes will need a constructor that takes a LinkedList
//1. Write a Java program to append the specified element to the end of a hash set.
class Exercise1 {
    //constructor
    public Exercise1(HashSet<String> x) {
        System.out.println("1. Write a Java program to append the specified element to the end of a hash set.");
        UserInput.printHashSetNumbered(x);//print out list fist
        //append to a specific locations
        //get users locations
        moveElementToEnd(recreateToLinkedHashSet(x));
    }

    public HashSet<String> recreateToLinkedHashSet(HashSet<String> x) {
        HashSet<String> y = new LinkedHashSet<String>();
        y.addAll(x);
        return y;
    }

    public void moveElementToEnd(HashSet<String> newName) {
        System.out.println("Which name would you like to set to the end of the list?");
        String move = UserInput.inputString();
        newName.remove(move);
        newName.add(move);

        System.out.println("After:\n" + newName);
    }
}

// 2. Write a Java program to iterate through all elements in a hash list.
class Exercise2{
    //constructor
    public Exercise2(HashSet<String> x) {
        int i = 0;
        Iterator it = x.iterator();
        System.out.println("\n2. Write a Java program to iterate through all elements in a hash list.");
        System.out.println("Before: " + x);
        while (it.hasNext()) {
            System.out.println(++i + ". " + it.next());
        }
    }

    //methods

}

//3. Write a Java program to get the number of elements in a hash set.
class Exercise3{
    //constructor
    public Exercise3(HashSet<String> x) {
        int i = 0;
        System.out.println("3. Write a Java program to get the number of elements in a hash set.");
        UserInput.printHashSetNumbered(x);
        Iterator it = x.iterator();
        while (it.hasNext()) {
            it.next();
            i++;
        }
        System.out.println("You have \"" + i + "\" elements in your list.");
    }
}

// 4. Write a Java program to empty a hashset.
class Exercise4{
    //constructor
    public Exercise4(HashSet<String> x) {
        System.out.println("// 4. Write a Java program to empty a hashset.");
        UserInput.printHashSetNumbered(x); // print out x before
        x.clear();
        System.out.println("after: " + x);
    }
}

//user input class.
class UserInput{
    //Messages will be done by the main programs.
    //methods
    public static String inputString() {
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }

    public static int inputInt() {
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }

    public static HashSet createHashSet() {
        HashSet<String> names = new HashSet<>();
        int counter = 0;
        System.out.println("Enter a name. Type stop to continue:");
        do {
            System.out.print(++counter + ". ");
            names.add(inputString());
        } while (!names.contains("stop"));

        if (names.contains("stop")) {
            names.remove("stop");
        }

        return names;
    }

    public static void printHashSetNumbered(HashSet<String> x) {
        System.out.println("Before: ");

        int i = 0;
        Iterator it = x.iterator();
        while (it.hasNext()) {
            System.out.print(++i + ". " + it.next() + " ");
        }
        System.out.println("\n");
    }
}