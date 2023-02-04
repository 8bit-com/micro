package com.example.bookservice.repository;

import com.example.bookservice.model.Book;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.transaction.annotation.Transactional;

@Transactional
public interface BookRepository extends MongoRepository<Book, String> {
}
