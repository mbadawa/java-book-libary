package com.readbook.readABook.api.model;


import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="book")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Book {
    @Id
    @GeneratedValue
    private int id;
    private int pagesRead;
    private String bookName;
    private String category;
}
