package com.example.bookservice.controller;

import com.example.bookservice.BookServiceApplication;
import com.example.bookservice.model.Book;
import com.example.bookservice.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class BookRestController {
    private final BookService bookService;

    @GetMapping("/books")
    public List<Book> getBooks(){
        return bookService.findAll();
    }

}
