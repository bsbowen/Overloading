package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class BookMain {
    public static void main(String[] args) {
        ArrayList<Book> books = new ArrayList<>(); // Create an ArrayList to store Book objects
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object for user input

        // Loop to continuously ask for user input
        while (true) {
            System.out.print("Enter the title of the book: ");
            String title = scanner.nextLine(); // Read the book title from the user
            if (title.isEmpty()) {
                // Break the loop if the user enters an empty title
                break;
            }

            System.out.print("Enter the number of pages: ");
            int pages = Integer.parseInt(scanner.nextLine()); // Read the number of pages from the user

            System.out.print("Enter the publication year: ");
            int year = Integer.parseInt(scanner.nextLine()); // Read the publication year from the user

            // Add a new Book object to the list
            books.add(new Book(title, pages, year));
        }

        //adding books using overloaded constructors
        books.add(new Book("The Great Gatsby", 180));
        books.add(new Book());

        // Ask the user what information should be printed
        System.out.print("What information will be printed? ");
        String choice = scanner.nextLine();

        // Print the books based on the user's choice
        if (choice.equals("everything")) {
            for (Book book : books) {
                System.out.println(book);
            }
        } else if (choice.equals("name")) {
            for (Book book : books) {
                System.out.println(book.getTitle());
            }
        }
    }
}
