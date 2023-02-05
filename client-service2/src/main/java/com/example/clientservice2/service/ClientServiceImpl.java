package com.example.clientservice2.service;

import com.example.clientservice2.connector.BookServiceConnector;
import com.example.clientservice2.model.Book;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class ClientServiceImpl implements ClientService {
    private final BookServiceConnector bookServiceConnector;
    @Override
    public List<Book> getAllBooks() {
        return bookServiceConnector.getAllBooks();
    }
}
