package com.example.demoweb.service;

import com.example.demoweb.model.Post;
import com.example.demoweb.repository.PostRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public class PostService {

    @Autowired
    PostRepository postRepository;

    public Iterable<Post> listAllPosts() {
        return postRepository.findAll();
    }

    public void create(String text) {
        long possibleid = postRepository.count();

        do{
            possibleid++;
        }while (postRepository.existsById(possibleid));

        Post post = new Post(possibleid, text, new Date());
        postRepository.save(post);
    }

}
