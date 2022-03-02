package com.netcompany.bookstore.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookControllerTest {

    @Test
    void hello() {
        BookController controller = new BookController(); // Arrange
        String response = controller.hello(); // Act
        assertEquals("Hello World", response); // Assert
    }

    @Test
    void findAll() {
        BookController controller = new BookController(); // Arrange
        // Act
        // Assert
    }
}