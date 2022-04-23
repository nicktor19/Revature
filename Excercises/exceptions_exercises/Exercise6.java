package com.company.Week2.Day4.exercise;
/*
* 6. Program to validate student record
*/

import java.util.Scanner;

public class Exercise6 {
    public static void main(String[] args) {
        Student student = new Student();
        do {
            // First and last name?
            System.out.println("Student First and last name?");
            Scanner s = new Scanner(System.in);
            if (s.hasNext()) {
                 student.setFirstName(s);
                student.setLastName(s);
            }
            //vaccinated?
            System.out.println("Student vaccinated? (type yes or y, Type anything for No.");
            if (s.hasNext()) {
                student.setVaccinated(s.next());
            }
            //validate:
            try {
                System.out.println(student.getFirstName());
                System.out.println(student.getLastName());
                System.out.println("\nValidate your answers:");
                System.out.println(student); //print out private fields of student.
                System.out.println("Type Y or Yes to submit.\nType Anything to cancel and restart.");

                if (s.hasNext()) {
                    student.setValidate(s.next());
                }

            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        } while (!student.isValidate());
    }
}

class Student{
    private String firstName;
    private String lastName;
    private boolean vaccinated;
    private boolean validate = false;

    //override return toString;
    @Override
    public String toString(){
        return "First Name : " + firstName +
                "\nLast Name: " + lastName +
                "\nVaccinated: " + vaccinated +
                "\n";
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(Scanner scan) {
        this.firstName = scan.next();
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(Scanner scan) {
        this.lastName = scan.next();
    }

    public void setVaccinated(String l) {
        if (l.equalsIgnoreCase("Y") || (l.equalsIgnoreCase("Yes"))) {
            this.vaccinated = true;
        } else {
            this.vaccinated = false;
        }

    }

    public boolean isValidate() {
        return validate;
    }

    //method to validate
    public void setValidate(String l) throws Exception {
        //convert l to uppercase and compare to Y.
        if (l.equalsIgnoreCase("Y") || (l.equalsIgnoreCase("Yes"))) {
            this.validate = true;
            System.out.println("Thank you! Have a good day!");
        } else {
            throw new Exception("Please re-complete the form.");
        }
    }
}