package com.netcompany.bookstore.service;

import com.netcompany.bookstore.dto.BookDto;
import com.netcompany.bookstore.model.Book;

import java.util.List;

public interface BookService {

    List<BookDto> findAll();

    void saveNewData();
}
