package com.example.liddleoxfordlibrary.controller;

import com.example.liddleoxfordlibrary.model.Book;
import com.example.liddleoxfordlibrary.service.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.logging.Logger;

@RestController
@RequestMapping("/api")
public class BookController {
    private BookService bookService;
    private static final Logger LOGGER = Logger.getLogger(BookController.class.getName());
    @GetMapping("/books")
    public List<Book> getBooks(){
    LOGGER.info("calling getBooks method from controller");
    return bookService.getBooks();
    }
}
