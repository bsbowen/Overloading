package org.example;

// Define the Animal class
class Animal {
    private String name; // Attribute to store the name of the animal
    private boolean isDog; // Attribute to indicate if the animal is a dog

    // Constructor to initialize the name and isDog attributes
    public Animal(String name, boolean isDog) {
        this.name = name;
        this.isDog = isDog;
    }

    // Constructor to initialize only name, default isDog to false
    public Animal(String name) {
        this.name = name;
        this.isDog = false;
    }

    // Default constructor
    public Animal() {
        this.name = "Unknown";
        this.isDog = false;
    }


    // Getter for the name attribute
    public String getName() {
        return name;
    }

    // Getter for the isDog attribute
    public boolean isDog() {
        return isDog;
    }

    // Override the toString method to provide a formatted string
    @Override
    public String toString() {
        return getName() + " is a dog = " + isDog();
    }
}