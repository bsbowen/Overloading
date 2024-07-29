package org.example;

// Define the TvShow class
class TvShow {
    private String showName; // Attribute to store the name of the TV show
    private int episodes;    // Attribute to store the number of episodes
    private String genre;    // Attribute to store the genre of the TV show

    // Constructor to initialize the showName, episodes, and genre attributes
    public TvShow(String showName, int episodes, String genre) {
        this.showName = showName;
        this.episodes = episodes;
        this.genre = genre;
    }

    // Constructor to initialize only showName and episodes, default genre to "Unknown"
    public TvShow(String showName, int episodes) {
        this.showName = showName;
        this.episodes = episodes;
        this.genre = "Unknown";
    }

    // Default constructor
    public TvShow() {
        this.showName = "Unknown";
        this.episodes = 0;
        this.genre = "Unknown";
    }


    // Getter for the showName attribute
    public String getShowName() {
        return showName;
    }

    // Getter for the episodes attribute
    public int getEpisodes() {
        return episodes;
    }

    // Getter for the genre attribute
    public String getGenre() {
        return genre;
    }

    // Override the toString method to provide a formatted string
    @Override
    public String toString() {
        return "The name of the show is " + getShowName() + " with "
                + getEpisodes() +
                " number of episodes. The genre is " + getGenre();
    }
}

