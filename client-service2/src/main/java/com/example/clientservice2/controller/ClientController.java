package com.example.clientservice2.controller;

import com.example.clientservice2.model.Book;
import com.example.clientservice2.service.ClientService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("api/client")
@AllArgsConstructor
public class ClientController {
    private final ClientService clientService;

    @GetMapping("/book")
    public List<Book> getAllBooks() {
        return clientService.getAllBooks();
    }

    @GetMapping("/users")
    public String getAllUsers() {
        return "JJJJJJJJJ";
    }
}
