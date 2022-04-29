package com.company.Week1.Day2;

import java.util.Scanner;

class EmployeeExercise{
    //fields //attributes
    private String firstName;
    private String lastName;
    private String jobTitle;
    private String address;
    private double salary;


    //constructors
    public EmployeeExercise(){
        Scanner scanner = new Scanner(System.in);

        //get employee data(s)
        System.out.println("First Name: ");
        firstName = scanner.nextLine();
        System.out.println("Last Name: ");
        lastName = scanner.nextLine();
        System.out.println("Employee Job Title: ");
        jobTitle = scanner.nextLine();
        System.out.println("Employee Address: ");
        address = scanner.nextLine();
        System.out.println("Employee Salary: ");
        salary = scanner.nextDouble();

        System.out.println("-- This Employee Record --");
        System.out.println("Employee Name: " + fullName());
        System.out.println("Employee Job Title:" + jobTitle);
        System.out.println("Employee Address: " + address);
        System.out.println("Employee Salary: $" + salary);
    }

    //methods
    private String fullName() {
        return this.firstName + ' ' + this.lastName;
    }
}

class Student{
    //fields //class attributes
    private String name;
    private String gradeLevel; // high school, college, ect.
    private boolean vaccinated;
    private int age;
    private float gpaScore;

    //constructor Acts like setter and getter
    public Student() {
        //get the data using the console and using import of Scanner;
        Scanner scanner = new Scanner(System.in);
        //set name
        System.out.println("What is this student Name?");
        name = scanner.nextLine();
        //set gradeLevel
        System.out.println("What is this student Grade Level?");
        gradeLevel = scanner.nextLine();
        //set vaccinated status
        System.out.println("Are they Vaccinated? (True, False)");
        vaccinated = scanner.nextBoolean();
        //set age
        System.out.println("What is this student age?");
        age = scanner.nextInt();
        //set gpsScore
        System.out.println("What is this student GPA?");
        gpaScore = scanner.nextFloat();

        System.out.println("-- Student Record --");
        System.out.println("Student Name: " + name);
        System.out.println("Highest Grade Level: " + gradeLevel);
        System.out.println("Vaccinated Status: " + vaccinated);
        System.out.println("Age: " + age);
        System.out.println("GPA: " + gpaScore);
    }
}

public class Exercises {
    public static void main(String[] args) {
        System.out.println("---------1");
        ex1();
        System.out.println("---------2");
        ex2();
        System.out.println("---------3");
        ex3();
        System.out.println("---------4");
        ex4();
        System.out.println("---------5");
        ex5();
        //System.out.println("---------6");
        //ex6(); was told to skip
        System.out.println("---------7");
        ex7();
        System.out.println("---------8");
        ex8();

        //Class exercise
        System.out.println("--------- Class Employee2");
        EmployeeExercise peon1 = new EmployeeExercise();

        System.out.println("--------- Class Student");
        Student s1 = new Student();

    }

    public static void ex1()
    {
        //Write a program to sum first n even numbers using a while loop.
        int num = 1;
        int max = 100;
        int total = 0;
        while (num < max) {
            if (num % 2 == 0){
                total = num + total;
            }
            num++;
        }
        System.out.println(total);
    }

    public static void ex2()
    {
        //Write a program to print the multiplication table of a given number n.
        int givenNum = 5;
        int multiplierMax = 12;
        int multiplier = 0;
        do {
            System.out.print(givenNum + " X " + multiplier + " = ");
            System.out.println(givenNum * multiplier);
            multiplier++;
        } while (multiplier <= multiplierMax);
    }

    public static void ex3() {
        //Write a program to print a multiplication table of 10 in reverse order.
        int givenNum = 5;
        int multiplierMax = 12;

        do {
            System.out.print(givenNum + " X " + multiplierMax + " = ");
            System.out.println(givenNum * multiplierMax);
            multiplierMax--;
        } while (multiplierMax >= 0);

    }

    public static void ex4() {
        //Write a program to find the factorial of a given number using for loops.
        int num = 5;
        int total = 0;

        for (int i = num; i >= 1; i--) {
            if (i == 5)
                total += 5;
            else if (i < 5)
                total *= i;
        }
        System.out.println("Factorial of " + num + " : " + total);
    }

    public static void ex5() {
        //Repeat problem 5 using a while loop.
        int setNum = 5;
        int num = setNum;
        int total = 0;
        while (num > 0) {
            if (num == 5) {
                total +=5;
            } else if (num < 5) {
                total *= num;
            }
            num--;
        }
        System.out.println("Factorial of " + setNum + " : " + total);
    }

    public static void ex7() {
        // What can be done using one type of loop can also be done using the other two types of loops - True or False.
        System.out.println("True");
    }

    public static void ex8() {
        //Write a program to calculate the sum of the numbers occurring in the multiplication table of 8.
        int eight = 8;
        int multiMax = 12;
        int total = 0;
        for (int i = 0; i <= multiMax; i++) {
            total += (eight * i);
        }
        System.out.println("Total of all results" + " : " + total);
    }
}

