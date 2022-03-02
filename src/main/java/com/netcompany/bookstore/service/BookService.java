package com.netcompany.bookstore.service;

import com.netcompany.bookstore.dto.BookDto;
import com.netcompany.bookstore.model.Book;

import java.util.List;
import java.util.Optional;

public interface BookService {

    List<BookDto> findAll();

    void saveNewData();

    Book save(Book newBook);

    Optional<Book> findById(Long id);
}
