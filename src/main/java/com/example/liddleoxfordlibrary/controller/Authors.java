package com.example.liddleoxfordlibrary.controller;

import org.jetbrains.annotations.Contract;
import org.jetbrains.annotations.NotNull;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Authors {

    @GetMapping("/authors")
    public  String Authors(){
        return "Here is where you will search by author.";
    }
}
