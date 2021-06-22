package com.Book.projectBook.Service;

import com.Book.projectBook.Model.Book;

import com.Book.projectBook.Repository.BookRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;
import java.util.Optional;

@Service
public class BookService implements BookServiceInterface {


    @Autowired
    private BookRepository bookRepository;






    @Override
    public Book createBook(Book book) {
        return   bookRepository.save(book);


    }

    @Override
    public Book updateBook(Book book) {
        Optional<Book> optionalBook = bookRepository.findById(book.getId());
        Book updateBook = optionalBook.get();
        updateBook.setTitle(book.getTitle());
        updateBook.setAuthor(book.getAuthor());
        updateBook.setPublishedDate(book.getPublishedDate());

        return  bookRepository.save(updateBook);


    }

    @Override
    public String deleteById(Long id) {
        bookRepository.deleteById(id);
        return "Book removed"+ id;
    }


    @Override
    @Transactional(readOnly = true)
    public List<Book> listBook() {
        return (List<Book>) bookRepository.findAll();
    }

    @Transactional(readOnly = true)
    @Override
    public List<Book> listByAvailable(String available) {

            return null;
    }
    @Transactional(readOnly = true)
    @Override
    public List<Book> listByUnavailable(String unavailable) {
        return null;
    }


    @Override
    public Optional<Book> getBookById(Book book) {
        return bookRepository.findById(book.getId());
    }
}

