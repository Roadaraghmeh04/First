package com.example.first;

public class Book {
    private String title;
    private String auther;
    private String category;

    public Book(String title, String auther, String category) {
        this.title = title;
        this.auther = auther;
        this.category = category;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuther() {
        return auther;
    }

    public void setAuther(String auther) {
        this.auther = auther;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
