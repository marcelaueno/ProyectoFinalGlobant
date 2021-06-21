package com.Book.projectBook.Model;

import javax.persistence.*;
import java.util.Date;
import org.springframework.data.annotation.Id;

@Entity
@Table(name="booking")
public class Booking {

    @Id
    @Column(name="idBooking")
    @GeneratedValue(strategy= GenerationType.IDENTITY)//genere ai
    private Long idBooking;

    private Date startDate;
    private Date endDate;
    private User user;

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

    public void setEndDate(Date endDate) {
        this.endDate = endDate;
    }
}
