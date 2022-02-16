package com.example.ch3_3_hw.controller;


import com.example.ch3_3_hw.model.Post;
import com.example.ch3_3_hw.service.PostService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @Autowired
    PostService postService;

    @GetMapping
    public String getAllPosts(Model model) {
        model.addAttribute("posts", postService.getAllPosts());
        return "index";
    }

    @PostMapping(value = "/add-post")
    public String addPost(@RequestParam(name = "postTitle") String title,
                          @RequestParam(name = "postShortDesc") String shortDesc,
                          @RequestParam(name = "postLongDesc") String longDesc,
                          @RequestParam(name = "postPictureUrl") String pictureUrl,
                          @RequestParam(name = "postDate") String date) {
        postService.addPost(new Post(null, title, shortDesc, longDesc, pictureUrl, date));
        return "redirect:/";
    }

    @GetMapping(value = "/details/{postId}")
    public String getPostById(Model model, @PathVariable(name = "postId") Long id) {
        model.addAttribute("post", postService.getPostById(id));
        return "/details";
    }
}
