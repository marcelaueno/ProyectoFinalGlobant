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

    @Column(name="available")
    @NotEmpty
    private String available;

    @Column(name="unavailable")
    @NotEmpty
    private String unavailable;

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


    public Book(Long id, String title, String author, Date publishedDate, String available, String unavailable, Booking booking) {

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


    public String getAvailable() {
        return available;
    }

    public void setAvailable(String available) {
        this.available =  (available != null) ? available.toUpperCase() : null;;
    }

    public String getUnavailable() {
        return unavailable;
    }

    public void setUnavailable(String unavailable) {
        this.unavailable =  (available != null) ? available.toUpperCase() : null;

    }

}
