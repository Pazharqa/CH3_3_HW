package com.example.ch3_3_hw.service;

import com.example.ch3_3_hw.model.Post;

import java.util.List;

public interface PostService {
    List<Post> getAllPosts();

    void addPost(Post post);

    Post getPostById(Long id);
}
