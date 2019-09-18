package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class PostService {

    static List<Post> posts = new ArrayList<>();

    public PostService(){
        create("Навальный снова сел");
        create("Wut have u done");
        create("Walking Dead");
    }

    public List<Post> listAllPosts() {
        return posts;
    }

    public void create(String text) {
        posts.add(new Post(posts.size()+1, text, new Date()));
    }

}
