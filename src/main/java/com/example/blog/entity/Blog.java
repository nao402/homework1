package com.example.blog.entity;

import java.time.LocalDateTime;

public class Blog {
//カプセル化をしつつ、変数の宣言をしました。
    private int id;
    private String title;
    private String content;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
    private LocalDateTime deletedAt;

//id用のGetterとSetter
    public int getId() {
        return id;

    }

    public void setId(int id) {
        this.id = id;
    }

//title用のGetterとSetter
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

//content用のGetterとSetter
    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

//createdAt用のGetterとSetter
    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    // updatedAt用のGetterとSetter
    public LocalDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(LocalDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    // deletedAt用のGetterとSetter
    public LocalDateTime getDeletedAt() {
        return deletedAt;
    }

    public void setDeletedAt(LocalDateTime deletedAt) {
        this.deletedAt = deletedAt;
    }

}
