package com.example.demoweb.model;

import java.util.Date;

public class Post {
    String text;
    Integer likes;
    private Date creationDate;

    public Date getCreationDate() {
        return creationDate;
    }

    public String getText() {
        return text;
    }

    public Integer getLikes() {
        return likes;
    }

    public Post(String text, Date date) {
        this.text = text;
        this.likes = 0;
        this.creationDate = date;
    }
}
