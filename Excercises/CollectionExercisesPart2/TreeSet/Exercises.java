package com.company.Week3.Day1.CollectionExercisesPart2.TreeSet;

import java.util.*;

public class Exercises {
    public static void main(String[] args) {
        //create one list for all .
        System.out.println("1. Write a Java program to create a new tree set, add some colors (string) and print out the tree set.");
        TreeSet<String> colors = UserInput.createTreeSet();
        System.out.println(colors);
        System.out.println("Select a number to choose from between 2 and 5:");
        switch (UserInput.inputInt()) {
            case 2:
                new Exercise2(colors); // 2. Write a Java program to iterate through all elements in a tree set.
                break;
            case 3:
                new Exercise3(colors); // 3. Write a Java program to add all the elements of a specified tree set to another tree set.
                break;
            case 4:
                new Exercise4(colors); // 4. Write a Java program to create a reverse order view of the elements contained in a given tree set.
                break;
            case 5:
                new Exercise5(colors);// 5. Write a Java program to get the first and last elements in a tree set
                break;
            default:
                break;
        }
    }
}

//1. Write a Java program to create a new tree set, add some colors (string) and print out the tree set.
class Exercise2{
    //constructor
    public Exercise2(TreeSet<String> colors) {
        System.out.println("\n2. Write a Java program to iterate through all elements in a tree set.");

        Iterator it = colors.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}

// 3. Write a Java program to add all the elements of a specified tree set to another tree set.
class Exercise3{
    public Exercise3(TreeSet<String> colors) {
        TreeSet<String> newColors = (TreeSet<String>) colors.clone();

        System.out.println("removing first element in newColors: \nCurrent: " + newColors);
        newColors.pollFirst(); // removing first element
        System.out.println("newColors: " + newColors);

        System.out.println("removing last element in colors: \n Current: "  + colors);
        colors.pollLast(); // removing last element
        System.out.println("colors: " + colors);
    }
}

// 4. Write a Java program to create a reverse order view of the elements contained in a given tree set.
class Exercise4{
    public Exercise4(TreeSet<String> colors){
        System.out.println("4. Write a Java program to create a reverse order view of the elements contained in a given tree set.");
        //NavigableSet<String> reverseTreeSet = colors.descendingSet(); // use the interface NavigableSet.
        System.out.println("Before: ASC" + colors);
        //System.out.println("After: DES" + reverseTreeSet);
        System.out.println("After: DES" + colors.descendingSet());
    }
}

// 5. Write a Java program to get the first and last elements in a tree set
class Exercise5{
    public Exercise5(TreeSet<String> colors){
        System.out.println("5. Write a Java program to get the first and last elements in a tree set");
        System.out.println("First Element: " + colors.pollFirst());
        System.out.println("Last Element: " + colors.pollLast());
    }
}

class UserInput{
    //methods
    public static String inputString() {
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }

    public static int inputInt() {
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }

    public static TreeSet<String> createTreeSet() {
        int i = 0;
        TreeSet<String> colors = new TreeSet<>();
        System.out.println("Write the colors you want to add: Enter stop to end");
        do {
            System.out.print(++i + ". ");
            colors.add(inputString());
        } while (!colors.contains("stop"));

        if (colors.contains("stop")) {
            colors.remove("stop");
        }

        return colors;
    }

}
