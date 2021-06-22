package com.Book.projectBook.Service;

import com.Book.projectBook.Model.Book;
import com.Book.projectBook.Model.Booking;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface BookServiceInterface {


    public Book createBook(Book book);

    public Book updateBook(Book book);


    public String deleteById(Long id);

    public List<Book> listBook();

    @Query(value = "SELECT * FROM BOOK WHERE AVAILABLE = ?1", nativeQuery = true)
    public List<Book> listByAvailable(String available);

    @Query(value = "SELECT * FROM BOOK WHERE UNAVAILABLE = ?1", nativeQuery = true)
    public List<Book> listByUnavailable(String unavailable);

    public Optional<Book> getBookById(Book book);



}
