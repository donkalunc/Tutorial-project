package com.netcompany.bookstore.controller;

import com.netcompany.bookstore.dto.BookDto;
import com.netcompany.bookstore.model.Book;
import com.netcompany.bookstore.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class BookController {

    public String hello() {
        return String.format("Hello World");
    }

    @Autowired
    private BookService bookService;

    @GetMapping("/books")
    public List<BookDto> findAll() {
        return bookService.findAll();
    }

    @PostMapping("/books")
    Book newBook(@RequestBody Book newBook) {
        return bookService.save(newBook);
    }

    @GetMapping("/save")
    public String saveNewData() {
        bookService.saveNewData();
        return "saved some new data";
    }

    @GetMapping("/books/{id}")
    Optional<Book> one(@PathVariable Long id) {
        return bookService.findById(id);
    }

//    @GetMapping("/books/{author}")
//    Optional<Book> one(@PathVariable Long author) {
//        return bookRepository
//                (author);
//    }
}
