package com.Book.projectBook.Controller;

import com.Book.projectBook.Model.Book;
import com.Book.projectBook.Repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("book")
public class BookController {

    @Autowired
    public BookRepository bookRepository;

    @GetMapping
    public ResponseEntity<List<Book>> getBook() {
        List<Book> book = bookRepository.findAll();
        return ResponseEntity.ok(book);
    }

    @RequestMapping(value="{id}")
        public ResponseEntity<Book> getBookById(@PathVariable("id") Long id) {
        Optional<Book> optionalBook = bookRepository.findById(id);
        if (optionalBook.isPresent()) {
            return ResponseEntity.ok(optionalBook.get());
        } else {
            return ResponseEntity.noContent().build();
        }
    }

    @PostMapping
    public ResponseEntity<Book> createBook(@RequestBody Book book) {
        Book newBook = bookRepository.save(book);
        return ResponseEntity.ok(newBook);
    }

    @DeleteMapping(value="{id}")
    public ResponseEntity<Void> deleteBook(@PathVariable("id") Long id) {
        bookRepository.deleteById(id);
        return ResponseEntity.ok(null);
    }

    @PutMapping
    public ResponseEntity<Book> updateBook(@RequestBody Book book) {
        Optional<Book> optionalBook = bookRepository.findById(book.getId());
        if (optionalBook.isPresent()) {
            Book updateBook = optionalBook.get();
            updateBook.setTitle(book.getTitle());
            updateBook.setAuthor(book.getAuthor());
            updateBook.setPublishedDate(book.getPublishedDate());
            bookRepository.save(updateBook);
            return ResponseEntity.ok(updateBook);
        } else {
            return ResponseEntity.notFound().build();
        }
    }
}
