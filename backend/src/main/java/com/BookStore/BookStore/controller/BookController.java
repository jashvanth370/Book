package com.BookStore.BookStore.controller;

import com.BookStore.BookStore.service.BookService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class BookController {

    BookService bookService;

    @GetMapping("/")
    public String home(){
        return "home";
    }

    @GetMapping("/book_register")
    public String addBook(){
        return "bookRegister";
    }

    @GetMapping("/available_books")
    public String getAllBooks(){
        return "bookList";
    }
}
