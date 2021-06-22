package com.Book.projectBook.Service;

import com.Book.projectBook.Model.Book;
import com.Book.projectBook.Model.Booking;

import java.util.List;
import java.util.Optional;

public interface BookServiceInterface {


    public Book createBook(Book book);

    public Book updateBook(Book book);


    public String deleteById(Long id);

    public List<Book> listBook();

    public List<Book> listByAvailable(String available);

    public List<Book> listByUnavailable(String unavailable);

    public Optional<Book> getBookById(Book book);

}
