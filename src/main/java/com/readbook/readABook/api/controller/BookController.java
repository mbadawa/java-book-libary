package com.readbook.readABook.api.controller;


import com.readbook.readABook.api.dao.BookDao;
import com.readbook.readABook.api.model.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api")
public class BookController {
    @Autowired
    private BookDao dao;



    @PostMapping("/add")
    public String registerBook(@RequestBody List<Book> books){
        dao.saveAll(books);
        return "Your book been added successfully " + books.size();
    }
    @GetMapping("/all")
    public List<Book> getAllBooks(){
        return (List<Book>) dao.findAll();
    }

    // gets the id of the book
    @GetMapping("/{id}")
    public Book getBook(@PathVariable("id") int id){
        return dao.findById(id).get();
    }

    // updates the book
    @PutMapping("/update/{id}")
    public Book updateBook(@PathVariable("id") int id, @RequestBody Book book){
        book.setId(id);
        return dao.save(book);
    }

    // deletes the book
    @DeleteMapping("/delete/{id}")
    public String deleteBook(@PathVariable("id") int id) {
        dao.deleteById(id);
        return "Your book has been deleted successfully";
    }
}
