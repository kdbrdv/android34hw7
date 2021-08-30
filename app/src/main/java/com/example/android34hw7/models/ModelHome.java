package com.example.android34hw7.models;

public class ModelHome {
    private int image;
    private String description, date;

    public ModelHome(int image, String description, String date) {
        this.image = image;
        this.description = description;
        this.date = date;
    }

    public int getImage() {
        return image;
    }

    public String getDescription() {
        return description;
    }

    public String getDate() {
        return date;
    }
}
