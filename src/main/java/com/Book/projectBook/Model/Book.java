package com.Book.projectBook.Model;


import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.NonNull;
import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
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

    @Column(name="status", length = 45)
    @NotEmpty
    private String status;

//    @Column(name="details", length = 45)
//    @NotEmpty
//    private String details;

    @OneToOne(mappedBy = "book") //propiedad dentro de booking
    private Booking booking;

    public Book() {
    }

    public Book(Long id, String title, String author, @NonNull Date publishedDate, String status, String details, Booking booking) {
        this.id = id;
        this.title = title;
        this.author = author;
        this.publishedDate = publishedDate;
        this.status = status;
//        this.details = details;
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

    public String getAuthor() { return author; }

    public void setAuthor(String author) {
        this.author =  (author != null) ? author.toUpperCase() : null;
    }

    public Date getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(Date publishedDate) {
        this.publishedDate = publishedDate;
    }

    public String getStatus() {  return status;   }

    public void setStatus(String status) {
        this.status = (status != null) ? status.toUpperCase() : null;
    }

    public String getDetails() { return details;   }

    public void setDetails(String details) {
        this.details = (details != null) ? details.toUpperCase() : null;
    }

   public Booking getBooking() {
        return booking;
    }

    public void setBooking(Booking booking) {
        this.booking = booking;
    }
}
