package com.Book.projectBook.Controller;

import com.Book.projectBook.Model.Book;

import com.Book.projectBook.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("book")
public class BookController {


    @Autowired
    private BookService bookService;



    @GetMapping
    public List<Book> listBook() {
        return bookService.listBook();
    }


    @PostMapping
    public Book createBook(@RequestBody Book book) {
        return bookService.createBook(book);
    }

    @RequestMapping(value="{bookId}")
    public Optional<Book> getBookById(@PathVariable("bookId") Book book) {
        return bookService.getBookById(book);

    }

    @DeleteMapping(value="{bookId}")
    public String deleteBookById(@PathVariable("bookId") Long id) {
        return bookService.deleteById(id);
    }

    @PutMapping
    public Book updateBook(@RequestBody Book book) {
        return bookService.updateBook(book);
    }


}
