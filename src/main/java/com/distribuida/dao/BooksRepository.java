package com.distribuida.dao;

import com.distribuida.db.Books;

import java.util.List;

public interface BooksRepository {
    List<Books> findAll();

    Books findById(Integer id);

    void save(Books books);

    void update(Books books);

    void deleteById(Integer id);


}
