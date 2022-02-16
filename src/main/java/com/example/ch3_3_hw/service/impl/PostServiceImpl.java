package com.example.ch3_3_hw.service.impl;

import com.example.ch3_3_hw.model.Post;
import com.example.ch3_3_hw.repository.PostRepository;
import com.example.ch3_3_hw.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PostServiceImpl implements PostService {
    @Autowired
    private PostRepository postRepository;

    @Override
    public List<Post> getAllPosts() {
        return postRepository.getAllPosts();
    }

    @Override
    public void addPost(Post post) {
        postRepository.addPost(post);
    }

    @Override
    public Post getPostById(Long id) {
        return postRepository.getPostById(id);
    }
}
