package com.example.ch3_3_hw.repository;

import com.example.ch3_3_hw.model.Post;

import java.util.List;

public interface PostRepository {
    List<Post> getAllPosts();

    void addPost(Post post);

    Post getPostById(Long id);
}
