package com.example.blog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.example.blog.entity.Blog;
import com.example.blog.service.BlogService;

@Controller
public class BlogController {

    @Autowired
    private BlogService blogService;

    @GetMapping("/blogs")
    public String list(Model model) {
        List<Blog> blogs = blogService.list();

        model.addAttribute("blogs", blogs);

        return "blog/list";
    }

    @GetMapping("/blogs/{id}")
    public String detail(@PathVariable("id") int id, Model model) {

        Blog blog = blogService.detail(id);

        model.addAttribute("blog", blog);
        return "blog/detail";
    }

}
