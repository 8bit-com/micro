package com.example.clientservice3.service;

import com.example.clientservice3.connector.BookServiceConnector;
import com.example.clientservice3.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ClientServiceImpl implements ClientService {
    private final BookServiceConnector bookServiceConnector;

    public ClientServiceImpl(BookServiceConnector bookServiceConnector) {
        this.bookServiceConnector = bookServiceConnector;
    }

    @Override
    public List<Book> getAllBooks() {
        return bookServiceConnector.getAllBooks();
    }
}
