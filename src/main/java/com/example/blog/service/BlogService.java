package com.example.blog.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.blog.entity.Blog;
import com.example.blog.repository.BlogMapper;

@Service
public class BlogService {

    @Autowired
    private BlogMapper blogMapper;

    public List<Blog> list() {
        return blogMapper.findAll();
    }

    public Blog detail(int id) {
        return blogMapper.findById(id);
    }

}
