package com.example.payroll;


import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class BookRepository {
    private List<Book> bookList = new ArrayList<>();


    public List<Book> getAllBooks() {

        return bookList;
    }



    public Book save(Book b) {
        Book book = new Book();
        book.setTitle(b.getTitle());
        book.setAuthor(b.getAuthor());
        book.setYear(b.getYear());
        bookList.add(book);
        return book;
    }


}

