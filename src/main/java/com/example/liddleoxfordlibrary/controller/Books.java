package com.example.liddleoxfordlibrary.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Books {
    @GetMapping("/books")
    public  String Books(){
        return "Here is where you will go to see all of the books.";
    }
}
