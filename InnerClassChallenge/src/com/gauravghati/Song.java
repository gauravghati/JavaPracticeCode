package com.gauravghati;

public class Song {
    private String title;
    private double duration;

    Song(String title, double duration) {
        this.title = title;
        this.duration = duration;
    }

    String getTitle() {
        return title;
    }

    @Override
    public String toString() {
        return this.title + ": " + this.duration;
    }
}