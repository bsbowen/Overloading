package org.example;

// Define the Book class
class Book {
    private String title;           // Attribute to store the title of the book
    private int pages;              // Attribute to store the number of pages
    private int publicationYear;    // Attribute to store the publication year

    // Constructor to initialize the title, pages, and publicationYear attributes
    public Book(String title, int pages, int publicationYear) {
        this.title = title;
        this.pages = pages;
        this.publicationYear = publicationYear;
    }

    // Constructor to initialize only title and pages, default publicationYear to 0
    public Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
        this.publicationYear = 0;
    }

    // Default constructor
    public Book() {
        this.title = "Unknown";
        this.pages = 0;
        this.publicationYear = 0;
    }

    // Getter for the title attribute
    public String getTitle() {
        return title;
    }

    // Getter for the pages attribute
    public int getPages() {
        return pages;
    }

    // Getter for the publicationYear attribute
    public int getPublicationYear() {
        return publicationYear;
    }

    // Override the toString method to provide a formatted string
    @Override
    public String toString() {
        return title + ", " + pages + " pages, " + publicationYear;
    }
}

