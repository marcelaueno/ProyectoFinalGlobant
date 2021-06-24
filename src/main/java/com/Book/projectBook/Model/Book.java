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
    @Column(name="infoBooking", length = 45)
    @NotEmpty
    private String infoBooking;


       public Book() {
    }

    public Book(Long id, String title, String author, @NonNull Date publishedDate, String reserved, String infoBooking) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publishedDate = publishedDate;
        this.reserved = reserved;
        this.infoBooking = infoBooking;
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

    public String getReserved() {
        return reserved;
    }

    public void setReserved(String reserved) {
        this.reserved = reserved;
    }

    public String getInfoBooking() {
        return infoBooking;
    }

    public void setInfoBooking(String infoBooking) {
        this.infoBooking = infoBooking;
    }
}
