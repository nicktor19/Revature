package com.company.Week1.Day2;


public class Dog {
    private String dogName;
    private String breed;
    private String sound;
    private String ownerName;
    private int age;

    //constructor
    public Dog() {
        // return error
        System.out.println("You forget to add parameters into dog.");
    }

    public Dog(String dogName, String breed, String sound, String ownerName, int age) {
        //print out a message to show the dog object was created.
        System.out.println("Your dog was created successfully.");

        //this constructor is a type "parameterized";
        //this constructor job is setting the fields/class attributes through the parameters
        this.dogName = dogName;
        this.breed = breed;
        this.sound = sound;
        this.ownerName = ownerName;
        this.age = age;
    }

    // Copy constructs
    public Dog(Dog dogObj) { // takes the construct parameters above and places a copy of them here.
        this.dogName = dogObj.dogName;
        this.breed = dogObj.breed;
        this.sound = dogObj.sound;
        this.ownerName = dogObj.ownerName;
        this.age = dogObj.age;
    }

    public Dog(Dog dogObj, int age) {
        this.dogName = dogObj.dogName;
        this.breed = dogObj.breed;
        this.sound = dogObj.sound;
        this.ownerName = dogObj.ownerName;
        this.age = age;
    }

    //create methods to print out each attribute. (getters)
    public void getDogName() {
        System.out.println("Dog Name: " + this.dogName);
    }

    public void getBreed() {
        System.out.println("Breed: " + this.breed);
    }

    public void getSound() {
        System.out.println("Sound: " + this.sound);
    }

    public void getOwnerName() {
        System.out.println("Dogs Owner Name(s): " + this.ownerName);
    }

    public void getAge() {
        System.out.println("Dog Age: " + this.age);
    }

    public void printDogData() {
        getOwnerName();
        getDogName();
        getBreed();
        getAge();
        getSound();
    }


    public static void main(String[] args) {
        //instantiate your dog
        Dog myDog = new Dog(); // purpose to have error constructor print out

        Dog realDog = new Dog("Sunny", "Sheba Inu", "Woof...Woof", "Jackie & Ray", 7);

        realDog.getOwnerName();
        realDog.getDogName();
        realDog.getBreed();
        realDog.getAge();
        realDog.getSound();

        Dog dog2 = new Dog(realDog);

        Dog dog3 =  new Dog(realDog, 10);

        dog2.printDogData();

        dog3.printDogData();
    }
}
