package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class PostService {

    public Post[] listAllPosts() {
        return new Post[]{
                new Post("Навальный снова сел", new Date()),
                new Post("Сентябрь горит", new Date()),
                new Post("Студентам объявили амнистию", new Date())
        };
    }
}
