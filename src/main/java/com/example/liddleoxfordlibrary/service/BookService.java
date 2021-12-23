package com.example.liddleoxfordlibrary.service;

import com.example.liddleoxfordlibrary.exception.InformationNotFoundException;
import com.example.liddleoxfordlibrary.model.Book;
import com.example.liddleoxfordlibrary.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.logging.Logger;

@Service
public class BookService {
    private BookRepository bookRepository;
    private static final Logger LOGGER = Logger.getLogger(BookService.class.getName());

    @Autowired
    public void setBookRepository(BookRepository bookRepository){
        this.bookRepository = bookRepository;
    }

    public List<Book> getBooks(){
        LOGGER.info("calling getBooks method from service");
        return bookRepository.findAll();
    }

    public Optional<Book> getBook(Long bookId){
        LOGGER.info("calling getBook method from service");
        Optional<Book> book = bookRepository.findById(bookId);
        if (book.isPresent()){
            return book;
        } else {
            throw new InformationNotFoundException("book with id " + bookId + " not found.");
        }
    }

}
