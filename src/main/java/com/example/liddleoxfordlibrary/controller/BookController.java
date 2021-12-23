package com.example.liddleoxfordlibrary.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.logging.Logger;

@RestController
@RequestMapping("/api")
public class BookController {
    private static final Logger LOGGER = Logger.getLogger(BookController.class.getName());
    @GetMapping("/books")
    public  String Books(){
        return "Here is where you will go to see all of the books.";
    }
}
