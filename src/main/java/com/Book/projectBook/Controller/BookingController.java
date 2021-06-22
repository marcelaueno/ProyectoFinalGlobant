package com.Book.projectBook.Controller;


import com.Book.projectBook.Model.Book;
import com.Book.projectBook.Model.Booking;
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

    @GetMapping
    public List<Booking> listBooking() {
        return bookingService.listBooking();
    }

    @PostMapping
    public Booking createBooking(@RequestBody Booking booking) {
        return bookingService.createBooking(booking);
    }

    @RequestMapping(value="{bookingId}")
    public Optional<Booking> getBookingById(@PathVariable("bookingId") Booking booking) {
        return bookingService.getBookingById(booking);

    }

    @DeleteMapping(value="{bookingId}")
    public String deleteBookingById(@PathVariable("bookingId") Long idBooking) {
        return bookingService.deleteByIdBooking(idBooking);
    }

    @PutMapping
    public Booking updateBook(@RequestBody Booking booking) {
        return bookingService.updateBooking(booking);
    }


}
