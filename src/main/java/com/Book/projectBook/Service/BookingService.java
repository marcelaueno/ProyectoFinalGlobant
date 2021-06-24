package com.Book.projectBook.Service;

import com.Book.projectBook.Model.Book;
import com.Book.projectBook.Model.Booking;
import com.Book.projectBook.Model.User;
import com.Book.projectBook.Repository.BookingRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
public class BookingService implements BookingServiceInterface{


    @Autowired
    private BookingRepository bookingRepository;



    @Override
    public Booking createBooking(Booking booking) {
       return null;
    }

    @Override
    public Booking updateBooking(Book book, User user, Booking booking) {
        return  null;

    }

    @Override
    public String deleteByIdBooking(Long idBooking) {
        bookingRepository.deleteById(idBooking);
        return "User removed"+ idBooking;

    }

    @Override
    @Transactional(readOnly = true)
    public List<Booking> listBooking() {
       return (List<Booking>)bookingRepository.findAll();
    }

    @Override
    public Optional<Booking> getBookingById(Booking booking) {
        return bookingRepository.findById(booking.getIdBooking());
    }
}
