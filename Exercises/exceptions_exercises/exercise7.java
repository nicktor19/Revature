package com.company.Week2.Day4.exercise;

import java.util.Scanner;

//7. Program to prevent creation of second object

public class exercise7 {
    static private boolean stop = false;

    public static void main(String[] args) {
    //check if hearts available first.
        Scanner scan = new Scanner(System.in);
        do {
            System.out.println("Create a new record for Heart Donor clients:");
            System.out.println("Type Y or Yes to continue. Type anything else to exit.");
            String stopper = scan.next();
            if (stopper.equalsIgnoreCase("Y") || stopper.equalsIgnoreCase("Yes")) {
                DonorHearts client = new DonorHearts();
            } else {
                stop = true;
            }

        } while (!stop);
    }
}

class DonorHearts{
    //fields
    static private int amountHearts = 1;
    private String receiverName;
    private int age;

    //constructor
    public DonorHearts(){
        try{
            this.validateHearts();
            //continue program
            setReceiverName();
            setAge();
            System.out.println("");
        } catch (Exception e){
            System.out.println(e.getMessage());
        }

    }

    protected String getReceiverName() {
        return receiverName;
    }

    protected void setReceiverName() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Name of receiver: ");
        receiverName = scan.nextLine();
    }

    protected int getAge() {
        return age;
    }

    protected void setAge() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Age of Receiver: ");
        this.age = scan.nextInt();
    }

    protected int getAmountHearts() {
        return amountHearts;
    }

    //method to check if object should be created base on available hearts.
    //if no more hearts available than return Error, no Donor hearts available.
    protected void validateHearts() throws Exception{
        if (this.getAmountHearts() > 0) {
            amountHearts -= 1;//subtract one heart from list.
        } else {
            throw new Exception("No donor hearts available.");
        }
    }

    @Override
    public String toString() {
        return "Client Name: " + this.getReceiverName() +
                "\nClient Age: " + this.getAge() + "\n";
    }
}