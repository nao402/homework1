package com.example.blog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.blog.entity.Blog;
import com.example.blog.form.BlogForm;
import com.example.blog.service.BlogService;

@Controller
@RequestMapping("/blogs")
public class BlogController {

    @Autowired
    private BlogService blogService;

    @GetMapping
    public String list(Model model) {
        List<Blog> blogs = blogService.list();

        model.addAttribute("blogs", blogs);

        return "blog/list";
    }

    @GetMapping("/{id}")
    public String detail(@PathVariable("id") int id, Model model) {

        Blog blog = blogService.detail(id);

        model.addAttribute("blog", blog);
        return "blog/detail";
    }

    @GetMapping("/new")
    public String newForm(Model model) {
        model.addAttribute("blog", new BlogForm());
        return "blog/form";
    }

    @PostMapping
    public String create(@ModelAttribute BlogForm form) {
        blogService.create(form);
        return "redirect:/blogs";
    }

    @GetMapping("/{id}/edit")
    public String editForm(@PathVariable("id") int id, Model model) {
        Blog blog = blogService.detail(id);

        BlogForm form = new BlogForm();
        form.setId(blog.getId());
        form.setTitle(blog.getTitle());
        form.setContent(blog.getContent());

        model.addAttribute("blog", form);

        return "blog/form";

    }

    @PostMapping("/{id}")

    public String update(@PathVariable("id") int id, @ModelAttribute BlogForm form) {

        blogService.update(id, form);

        return "redirect:/blogs";
    }

    @PostMapping("/{id}/delete")
    public String delete(@PathVariable("id") int id) {
        blogService.delete(id);

        return "redirect:/blogs";
    }

}
