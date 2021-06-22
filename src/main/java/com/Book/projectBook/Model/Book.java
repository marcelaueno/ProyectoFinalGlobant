package com.Book.projectBook.Model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
@Table(name="BOOK")
public class Book {

    @Id
    @Column(name="idBook")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;
    @Column(name="title",nullable = false, length = 45)
    private  String title;
    @Column(name="author",nullable = false, length = 45)
    private  String author;
    @Column
    @NotNull
    private Date publishedDate;
    @Column(name="available")
    @NotNull
    private String available;
    @Column(name="unavailable")
    @NotNull
    private String unavailable;

    @OneToOne(cascade = CascadeType.ALL)
     private Booking booking;


    public Book() {
    }

    public Book(Long id, String title, String author, Date publishedDate, String available, String unavailable, Booking booking) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publishedDate = publishedDate;
        this.available = available;
        this.unavailable = unavailable;
        this.booking = booking;
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

    public String getAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available = available;
    }

    public String getUnavailable() {
        return unavailable;
    }

    public void setUnavailable(String unavailable) {
        this.unavailable = unavailable;
    }
}
