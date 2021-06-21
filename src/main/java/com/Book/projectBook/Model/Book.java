package com.Book.projectBook.Model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="book")
public class Book {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)//genere ai
    private Long id;
    @Column(name="title",nullable = false, length = 45)
    private  String title;
    @Column(name="author",nullable = false, length = 45)
    private  String author;
    @Column(name="publishedDate")
    private Date publishedDate;
    private boolean condition;
    private Booking booking;


    public Book() {
    }

    public Book(Long id, String title, String author, Date publishedDate, boolean enabled) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publishedDate = publishedDate;
        this.condition = condition;
    }


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Date getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(Date publishedDate) {
        this.publishedDate = publishedDate;
    }

    public boolean isCondition() {
        return condition;
    }

    public void setCondition(boolean condition) {
        this.condition = condition;
    }
}
