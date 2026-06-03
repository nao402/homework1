package com.example.blog.repository;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

import com.example.blog.entity.Blog;

@Mapper
public interface BlogMapper {

    // 一覧取得
    List<Blog> findAll();

    // ID 指定で取得する
    Blog findById(int id);

    // 新規登録
    void save(Blog blog);

    // 更新
    void update(Blog blog);

    // 削除
    void delete(int id);

}
