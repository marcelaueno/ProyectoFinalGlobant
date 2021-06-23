package com.Book.projectBook.Model;


import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.lang.NonNull;
import javax.persistence.*;
import java.util.Date;


@Entity
@Table(name="booking")
public class Booking {

    @Id
    @Column(name="idBooking")
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    private  Long idBooking;
    @Column
    @NonNull
    @DateTimeFormat(pattern="MM/dd/yyyy")
    private Date startDate;
    @Column
    @NonNull
    @DateTimeFormat(pattern="MM/dd/yyyy")
    private Date endDate;

    @ManyToOne(cascade = CascadeType.ALL)
     private User user;


    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Booking() {
    }

    public Booking(Long idBooking, Date startDate, Date endDate) {
        this.idBooking = idBooking;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public Long getIdBooking() {
        return idBooking;
    }

    public void setIdBooking(Long idBooking) {
        this.idBooking = idBooking;
    }

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
