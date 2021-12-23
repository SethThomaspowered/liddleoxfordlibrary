package com.example.liddleoxfordlibrary.controller;

import com.example.liddleoxfordlibrary.model.Book;
import com.example.liddleoxfordlibrary.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

@RestController
@RequestMapping("/api")
public class BookController {
    private BookService bookService;
    private static final Logger LOGGER = Logger.getLogger(BookController.class.getName());
    @Autowired
    public void setBookService(BookService bookService){
    this.bookService = bookService;
}
    @GetMapping("/books")
    public List<Book> getBooks(){
    LOGGER.info("calling getBooks method from controller");
    return bookService.getBooks();
    }
    @GetMapping("/books/{bookId}")
    public Optional<Book> getBook(@PathVariable(value = "bookId") Long bookId){
        LOGGER.info("calling getBook method from controller");
        return bookService.getBook(bookId);
    }
    @PostMapping("/books")
    public Book createNewBook(@RequestBody Book bookObject) {
        LOGGER.info("calling createNewBook method from controller");
        return bookService.createNewBook(bookObject);
    }
    @PutMapping("/books/{bookId}")
    public Book updateBook(@PathVariable(value = "bookId") Long bookId, @RequestBody Book bookObject){
        LOGGER.info("calling updateBook method from controller");
        return bookService.updateBook(bookId, bookObject);
    }
    @DeleteMapping("/books/{bookId}")
    public Optional<Book> deleteBook(@PathVariable(value = "bookId") Long bookId){
        LOGGER.info("calling deleteBook method from controller");
        return bookService.deleteBook(bookId);
    }
}
