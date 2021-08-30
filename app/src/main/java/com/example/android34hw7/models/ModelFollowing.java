package com.example.android34hw7.models;

public class ModelFollowing {
    private int imageFollower, likedPhoto;
    private int tvFollower;

    public int getImageFollower() {
        return imageFollower;
    }

    public int getLikedPhoto() {
        return likedPhoto;
    }

    public int getTvFollower() {
        return tvFollower;
    }

    public ModelFollowing(int imageFollower, int likedPhoto, int tvFollower) {
        this.imageFollower = imageFollower;
        this.likedPhoto = likedPhoto;
        this.tvFollower = tvFollower;
    }
}
