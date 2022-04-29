package com.company.Week3.Day4.IOExercises;

import java.io.File;
import java.io.FileDescriptor;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Exercises {
    String path = "src/com/company/Week3/Day4/IOExercises/db";

    public static void main(String[] args) {
        System.out.println("Select the program you want 1-8");
        System.out.println("1. Write a Java program to get a list of all file/directory names from the given.\n" +
                "2. Write a Java program to get specific files by extensions from a specified folder.\n" +
                "3. Write a Java program to check if a file or directory specified by pathname exists or not.\n" +
                "4. Write a Java program to check if given pathname is a directory or a file.\n" +
                "5. Write Java program to read input from java console.\n" +
                "6. Write a Java program to read a file content line by line.\n" +
                "7. Write a Java program to read first 3 lines from a file\n" +
                "8. Write a Java program to find the longest word in a text file.");
        Scanner scan = new Scanner(System.in);
        switch (scan.nextInt()) {
            case 1:
                new Exercise1(new Exercises().path);
                break;
            case 2:
                new Exercise2(new Exercises().path);
                break;
            case 3:
                new Exercise3(new Exercises().path);
                break;
            case 4:
                new Exercise4(new Exercises().path);
                break;
            case 5:
                new Exercise5(new Exercises().path);
                break;
            case 6:
                new Exercise6(new Exercises().path);
                break;
            case 7:
                new Exercise7(new Exercises().path);
                break;
            case 8:
                new Exercise8(new Exercises().path);
                break;
            default:
                break;
        }
    }
}

//1. Write a Java program to get a list of all file/directory names from the given.
class Exercise1 {
    //constructor
    public Exercise1(String path) {
        System.out.println("1. Write a Java program to get a list of all file/directory names from the given.");
        getReading(path);
    }

    //methods
    protected void getReading(String path) {
        File fd = new File(path);
        String[] list = fd.list();
        for (String newList : list) {
            System.out.println(newList);
        }
    }
}

//2. Write a Java program to get specific files by extensions from a specified folder.
class Exercise2 {
    public Exercise2(String path) {
        System.out.println("2. Write a Java program to get specific files by extensions from a specified folder.");
        System.out.println("Please enter file extension you are looking for (do not enter a period)?");

        String input = UserInputs.stringInput();

        File file = new File(path);
        String[] list = file.list();

        for (String newList : list) {
            if (newList.endsWith("." + input.toLowerCase())) {
                System.out.println(newList);
            }
        }
    }
}

//3. Write a Java program to check if a file or directory specified by pathname exists or not.
class Exercise3 {
    public Exercise3(String path) {
        int check = 0;
        System.out.println("3. Write a Java program to check if a file or directory specified by pathname exists or not.");
        File file = new File(path);
        String[] list = file.list();
        System.out.println("Enter the File name or Directory you want to see exist:");
        String input = UserInputs.stringInput().toLowerCase();
        for (String newList : list) {
            if ((newList.toLowerCase()).equalsIgnoreCase(input))
                check++;
        }
        if (check > 0)
            System.out.println(input + " : Exist");
        else
            System.out.println(input + " : Doesn't Exist");
    }
}


//4. Write a Java program to check if given pathname is a directory or a file.
class Exercise4 {
    public Exercise4(String path) {
        System.out.println("Enter Directory or file name.");
        String input = UserInputs.stringInput();

        File file = new File(path + "/" + input);
        System.out.println("Checking....");
        if (file.isDirectory())
            System.out.println("\"" + input + "\" is a Directory");
        else if (file.isFile())
            System.out.println("\"" + input + "\" is a File");
        else
            System.out.println("\"" + input + "\" doesn't exist");
    }
}

//5. Write Java program to read input from java console.
class Exercise5 {
    public Exercise5(String path) {
        System.out.println("Write anything you want to to print out on the console.");
        System.out.println(UserInputs.stringInput());
    }
}

//6. Write a Java program to read a file content line by line.
class Exercise6 {
    public Exercise6(String path) {
        File file = new File(path + "/second.txt");

        try {
            Scanner scan = new Scanner(file);

            while (scan.hasNextLine())
                System.out.println(scan.nextLine());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

//7. Write a Java program to read first 3 lines from a file
class Exercise7 {
    public Exercise7(String path) {
        File file = new File(path + "/second.txt");


        try {
            Scanner scan = new Scanner(file);
            int counter = 0;

            while (scan.hasNextLine() && counter < 3) {
                counter++;
                System.out.println(counter + ". " + scan.nextLine());
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

//8. Write a Java program to find the longest word in a text file.
class Exercise8 {
    public Exercise8(String path) {
        String savedWord = null;
        int LongestWord = 0;

        File file = new File(path + "/second.txt");

        try {
            Scanner scan = new Scanner(file);

            while (scan.hasNextLine()) {
                //compare lengths
                while (scan.hasNext()) {
                    String nextWord = scan.next().strip().replaceAll("[.,]", "");
                    System.out.println(nextWord);
                    if (LongestWord < nextWord.length()) {
                        LongestWord = nextWord.length();
                        savedWord = nextWord;
                    }
                }
            }

            System.out.println("The Longest Word is: " + savedWord);
            System.out.println("With the length of \"" + savedWord.length() + "\" Characters!");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}

class UserInputs {
    public static String stringInput() {
        Scanner scan = new Scanner(System.in);
        return scan.nextLine();
    }

    public static int intInput() {
        Scanner scan = new Scanner(System.in);
        return scan.nextInt();
    }
}