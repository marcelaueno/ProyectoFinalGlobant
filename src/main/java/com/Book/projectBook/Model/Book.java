package com.Book.projectBook.Model;


import javax.persistence.*;
import javax.validation.constraints.NotNull;
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
    @Column
    @NotNull
    private Date publishedDate;

    @OneToOne(cascade = CascadeType.ALL)
    private Booking booking;

    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public Book() {
    }

    public Book(Long id, String title, String author, Date publishedDate) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publishedDate = publishedDate;
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

}
