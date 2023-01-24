package com.example.payroll;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

    private final BookRepository repository;

    Controller(BookRepository repository) {
        this.repository = repository;
    }


    @GetMapping("/books")
    List<Book> all() {
        return repository.getAllBooks();
    }

    @PostMapping("/add-books")
    Book newBook(@RequestBody Book newBook) {
        return repository.save(newBook);
    }
}



