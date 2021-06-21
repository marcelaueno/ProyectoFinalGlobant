package com.Book.projectBook.Model;

import java.util.Date;


public class Booking {
    private  int idBooking;
    private Date startDate;
    private Date endDate;


    public Booking(int idBooking, Date startDate, Date endDate) {
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
