package com.example.demoweb.model;

public class Post {
    String text;
    Integer likes;

    public String getText() {
        return text;
    }

    public Integer getLikes() {
        return likes;
    }

    public Post(String text, Integer likes) {
        this.text = text;
        this.likes = likes;
    }
}
