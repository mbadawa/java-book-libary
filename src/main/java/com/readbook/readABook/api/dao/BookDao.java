package com.readbook.readABook.api.dao;

import com.readbook.readABook.api.model.Book;
import org.springframework.data.repository.CrudRepository;

public interface BookDao extends CrudRepository<Book, Integer> {

}
