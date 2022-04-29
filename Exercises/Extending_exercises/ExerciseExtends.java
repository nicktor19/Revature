package com.company.Week1.Day3.Exercises;

class Parent{
    public Parent() {
        System.out.println("This is the parent.");
    }
}

class Child extends Parent {
    public Child() {
        System.out.println("I'm the child.");
    }
}


public class ExerciseExtends {
    public static void main(String[] args) {
        Parent Mother = new Parent();
        Child Nick = new Child();
    }
}
