package com.Book.projectBook.Model;

import javax.persistence.*;
import java.util.Date;

@Entity
@Table(name="book")
public class Book {

    @Id
    @Column(name="id")
    @GeneratedValue(strategy=GenerationType.IDENTITY)//genere ai
    private int id;
    @Column(name="title",nullable = false, length = 30)
    private  String title;
    @Column(name="author",nullable = false, length = 30)
    private  String author;
    @Column(name="publishedDate")
    private Date publishedDate;
//    private boolean condition;


    public Book(int id, String title, String author, Date publishedDate) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publishedDate = publishedDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
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
/*
    public boolean isCondition() {
        return condition;
    }

    public void setCondition(boolean condition) {
        this.condition = condition;
    }
*/
}
