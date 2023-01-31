package com.distribuida.services;

import com.distribuida.db.Books;

import java.util.List;

public interface BookService {

    List<Books> findAll();

    Books findById(Integer id);

    void save(Books books);

    void update(Books books);

    void deleteByID(Integer id);


}
