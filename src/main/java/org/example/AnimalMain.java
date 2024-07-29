package org.example;


import java.util.ArrayList; // Import ArrayList class
import java.util.Scanner;   // Import Scanner class

public class AnimalMain {
    public static void main(String[] args) {
        ArrayList<Animal> animals = new ArrayList<>(); // Create an ArrayList to store Animal objects
        Scanner scanner = new Scanner(System.in);      // Create a Scanner object for user input

        System.out.println("Animal Menu\nEntering nothing will stop the loop");

        // Loop to continuously ask for user input
        while (true) {
            System.out.print("Please enter a name: ");
            String name = scanner.nextLine(); // Read the animal name from the user
            if (name.isEmpty()) {
                // Break the loop if the user enters an empty name
                break;
            }

            System.out.print("Is it a dog? Yes or no: ");
            String isDogInput = scanner.nextLine(); // Read if the animal is a dog
            boolean isDog = isDogInput.equalsIgnoreCase("yes");

            // Add a new Animal object to the list
            animals.add(new Animal(name, isDog));
        }

        //adding animals using overloaded constructors
        animals.add(new Animal("Buddy"));
        animals.add(new Animal());

        // Print the entered animals
        System.out.println("\nAnimals entered:");
        for (Animal animal : animals) {
            System.out.println(animal);
        }
    }
}