package com.Book.projectBook.Controller;


import com.Book.projectBook.Model.Book;
import com.Book.projectBook.Model.Booking;
import com.Book.projectBook.Model.User;
import com.Book.projectBook.Service.BookingService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("booking")
public class BookingController {

    @Autowired
    private BookingService bookingService;

    @GetMapping("/listBooking")
    public List<Booking> listBooking() {
        return bookingService.listBooking();
    }

    @PostMapping("/createBooking")
    public Booking createBooking(@RequestBody Book book, User user, Booking booking) {
        return bookingService.createBooking(book, user, booking);
    }

    @RequestMapping("/getBookingById/{bookId}")
    public Optional<Booking> getBookingById(@PathVariable("bookingId") Booking booking) {
        return bookingService.getBookingById(booking);

    }

    @DeleteMapping("/deleteBookingById/{bookId}")
    public String deleteBookingById(@PathVariable("bookingId") Long idBooking) {
        return bookingService.deleteByIdBooking(idBooking);
    }

    @PutMapping("/updateBooking")
    public Booking updateBooking(@RequestBody Book book, User user, Booking booking) {
        return bookingService.updateBooking(book, user, booking);
    }


}
