package com.Book.projectBook.Service;

import com.Book.projectBook.Model.Book;
import com.Book.projectBook.Model.Booking;
import com.Book.projectBook.Model.User;
import com.Book.projectBook.Repository.BookRepository;
import com.Book.projectBook.Repository.BookingRepository;
import com.Book.projectBook.Repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.FileWriter;
import java.util.*;

@Service
public class BookingService implements BookingServiceInterface{


    @Autowired
    private BookingRepository bookingRepository;
    @Autowired
    private BookRepository bookRepository;
    @Autowired
    private UserRepository userRepository;



    @Override
    public Booking createBooking(Booking booking) {
        Optional<Book> optionalBook = bookRepository.findById(booking.getBook().getId());
        Optional<User> optionalUser = userRepository.findById(booking.getUser().getId());
        Book book = optionalBook.get();
        User user = optionalUser.get();
        booking.setBook(book);
        booking.setUser(user);
        return bookingRepository.save(booking);
    }

//    @Override
//    public Booking updateBooking(Booking booking) {
//        Optional<Booking> optionalBooking = bookingRepository.findById(booking.getIdBooking());
//        Book updateBooking = optionalBooking.get();
//        updateBooking.setStartDate(booking.getStartDate());
//        updateBooking.setEndDate(booking.getEndDate());
//        return bookRepository.save(updateBooking);
//    }
//
//    @Override
//    public Booking updateBooking(Booking booking) {
////        Optional<Booking> optionalBooking = bookingRepository.findById(booking.getBook().getId());
////        Optional<User> optionalUser = userRepository.findById(booking.getUser().getId());
//        Booking updateBooking = optionalBooking.get();
//        updateBook.setId(booking.getBook().getId());
//        updateUser.setId(booking.getUser().getId());
//        updateBooking.setStartDate(booking.getStartDate());
//        updateBooking.setEndDate(booking.getEndDate());
//        return bookingRepository.save(updateBooking);
//    }

//    @Override
//    public Booking updateBooking(Book book, User user, Booking booking) {
//      /*Optional<Booking> optionalBooking = bookingRepository.findById(booking.getIdBooking());
//      Optional<Book> optionalBook = bookRepository.findById(book.getId());
//      Optional<User> optionalUser = userRepository.findById(user.getIdUser());
//        Book bookUpdate = new Book();
//        bookUpdate.setId(book.getId());
//        bookUpdate.setDetails(book.getDetails());
//        Booking updateBooking = optionalBooking.get();
//        updateBooking.setUser(booking.getUser());
//        updateBooking.setStartDate(booking.getStartDate());
//        updateBooking.setEndDate(booking.getEndDate());
//        updateBooking.setBook(book);
//            return  bookingRepository.save(book, user, booking);*/
//                return null;
//
//    }

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
