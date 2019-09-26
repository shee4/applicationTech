package com.example.demoweb.model;

import java.util.Date;

public class Post {
    private String text;
    private Integer likes;

    public Long getId() {
        return id;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public Date getCreationDate() {
        return creationDate;
    }

    public String getFormattedDate(){
        return new SimpleDateFormat("EEE, MMM d, ''yy").format(creationDate);
    }

    public String getText() {
        return text;
    }

    public int getLikes() {
        return likes;
    }
}
