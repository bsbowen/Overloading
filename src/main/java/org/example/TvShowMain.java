package org.example;

import java.util.ArrayList;
import java.util.Scanner;

public class TvShowMain {
    public static void main(String[] args) {
        ArrayList<TvShow> tvShows = new ArrayList<>(); // Create an ArrayList to store TvShow objects
        Scanner scanner = new Scanner(System.in);      // Create a Scanner object for user input

        // Loop to continuously ask for user input
        while (true) {
            System.out.print("Name of the show: ");
            String showName = scanner.nextLine(); // Read the TV show name from the user
            if (showName.isEmpty()) {
                // Break the loop if the user enters an empty name
                break;
            }

            System.out.print("How many episodes? ");
            int episodes = Integer.parseInt(scanner.nextLine()); // Read the number of episodes from the user

            System.out.print("What is the genre? ");
            String genre = scanner.nextLine(); // Read the genre of the TV show

            // Add a new TvShow object to the list
            tvShows.add(new TvShow(showName, episodes, genre));
        }

        // Adding TV shows using overloaded constructors
        tvShows.add(new TvShow("Friends", 236));
        tvShows.add(new TvShow());

        // Print the entered TV shows
        System.out.println("\nTV Shows entered:");
        for (TvShow tvShow : tvShows) {
            System.out.println(tvShow);
        }
    }
}
