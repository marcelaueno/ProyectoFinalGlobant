package com.Book.projectBook.Controller;

import com.Book.projectBook.Model.Book;

import com.Book.projectBook.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("book")
public class BookController {


    @Autowired
    private BookService bookService;



    @GetMapping ("/listBook")
    public List<Book> listBook() {
        return bookService.listBook();
    }

<<<<<<< HEAD
    @PostMapping("/createBook")
=======

  @PostMapping
>>>>>>> d30745d7c98e949c2bb44c64de86c40a2f86db1a
    public ResponseEntity<Book> createBook(@RequestBody Book book) {
        bookService.createBook(book);
        return  new ResponseEntity<Book>(HttpStatus.CREATED);
    }

    @RequestMapping("/getBookById/{bookId}")
    public Optional<Book> getBookById(@PathVariable("bookId") Book book) {
        return bookService.getBookById(book);

    }

<<<<<<< HEAD
    @DeleteMapping("/getBookById/{bookId}")
=======

    @DeleteMapping(value="{bookId}")
>>>>>>> d30745d7c98e949c2bb44c64de86c40a2f86db1a
    public String deleteBookById(@PathVariable("bookId") Long id) {
        return bookService.deleteById(id);

    }

    @PutMapping("/updateBook")
    public Book updateBook(@RequestBody Book book) {
        return bookService.updateBook(book);
    }


}
