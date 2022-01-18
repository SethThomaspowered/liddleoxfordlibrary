package com.example.liddleoxfordlibrary.repository;

import com.example.liddleoxfordlibrary.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
    Book findByBookTitle(String bookTitle);
}
