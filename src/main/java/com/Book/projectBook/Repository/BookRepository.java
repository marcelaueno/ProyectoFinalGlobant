package com.Book.projectBook.Repository;


import com.Book.projectBook.Model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface BookRepository extends JpaRepository<Book, Long> {

    List<Book> findByOrderByTitleAsc();
}
