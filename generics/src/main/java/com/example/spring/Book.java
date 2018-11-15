package com.example.spring;

/**
 * Created by alee2 on 8/2/17.
 *
 * @author alee2
 */
public class Book {
    private final String title;
    private final String author;

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    String getAuthor() {
        return author;
    }

    String getTitle() {
        return title;
    }
}
