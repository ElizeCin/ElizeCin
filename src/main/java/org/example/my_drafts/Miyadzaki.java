package org.example.my_drafts;

public class Miyadzaki {
    private String movieName;
    private int year;


    public String getMovieName() {
        return movieName;
    }

    public int getYear() {
        return year;
    }


    public Miyadzaki(String movieName, int year) {
        this.movieName = movieName;
        this.year = year;
    }


    public void printInfo() {
        System.out.println(movieName + ", " + year);
    }

}