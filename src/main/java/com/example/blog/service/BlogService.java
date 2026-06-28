package com.example.blog.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.example.blog.entity.Blog;
import com.example.blog.form.BlogForm;
import com.example.blog.repository.BlogMapper;

@Service
public class BlogService {

    private final BlogMapper blogMapper;

    public BlogService(BlogMapper blogMapper) {
        this.blogMapper = blogMapper;
    }

    public List<Blog> list() {
        return blogMapper.findAll();
    }

    public Blog detail(int id) {
        return blogMapper.findById(id);
    }

    public void update(int id, BlogForm form) {
        Blog blog = new Blog();
        blog.setId(id);

        blog.setTitle(form.getTitle());
        blog.setContent(form.getContent());

        blogMapper.update(blog);

    }

    public void create(BlogForm form) {

        Blog blog = new Blog();

        blog.setTitle(form.getTitle());
        blog.setContent(form.getContent());

        blogMapper.save(blog);

    }

    public void delete(int id) {
        blogMapper.delete(id);
    }

}
