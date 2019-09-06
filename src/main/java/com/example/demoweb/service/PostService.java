package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

@Service
public class PostService {

    public Post[] listAllPosts() {
        return new Post[]{
                new Post("Навальный снова сел", 35),
                new Post("Сентябрь горит", 20),
                new Post("Студентам объявили амнистию", 100)
        };
    }
}
