package com.Book.projectBook.Model;


import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.NonNull;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.Date;


@Entity
@Table(name="BOOK")
public class Book {

    @Id
    @Column(name="idBook")
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

    @Column(name="title", length = 45)
    @NotEmpty
    private  String title;

    @Column(name="author", length = 45)
    @NotEmpty
    private  String author;


    @Column
    @NonNull
    @DateTimeFormat(pattern="MM/dd/yyyy")
    private Date publishedDate;

    @Column(name="reserved")
    @NotEmpty
    private String reserved;



    public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }

    public Book() {
    }

<<<<<<< HEAD
    public Book(Long id, String title, String author, @NonNull Date publishedDate, String reserved) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publishedDate = publishedDate;
        this.reserved = reserved;
=======

    public Book(Long id, String title, String author, Date publishedDate, String available, String unavailable, Booking booking) {

      this.available = available;
        this.unavailable = unavailable;
        this.booking = booking;

>>>>>>> d30745d7c98e949c2bb44c64de86c40a2f86db1a
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
        this.title = (title != null) ? title.toUpperCase() : null;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author =  this.author = (author != null) ? author.toUpperCase() : null;
    }

    public Date getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(Date publishedDate) {
        this.publishedDate = publishedDate;
    }

<<<<<<< HEAD
    public String getReserved() {
        return reserved;
=======

    public String getAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available =  (available != null) ? available.toUpperCase() : null;;
>>>>>>> d30745d7c98e949c2bb44c64de86c40a2f86db1a
    }

    public void setReserved(String reserved) {
        this.reserved = reserved;
    }

}
