package com.Book.projectBook.Service;

import com.Book.projectBook.Exception.ExceptionBookExists;
import com.Book.projectBook.Model.Book;
import com.Book.projectBook.Model.Booking;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface BookServiceInterface {


     Book createBook(Book book) throws ExceptionBookExists;

     Book updateBook(Book book);

     String deleteById(Long id);

      List<Book> listBook();

      List<Book> listByStatus();

      Optional<Book> getBookById(Book book);

      List<Book> listAvailable();



}
