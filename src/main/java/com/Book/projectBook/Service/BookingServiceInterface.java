package com.Book.projectBook.Service;

import com.Book.projectBook.Model.Book;
import com.Book.projectBook.Model.Booking;

import java.util.List;
import java.util.Optional;

public interface BookingServiceInterface {


    public Booking createBooking(Booking booking);

    public Booking updateBooking(Booking booking);

    public String deleteByIdBooking(Long idBooking);

    public List<Booking> listBooking();

    public Optional<Booking> getBookingById(Booking booking);
}
