package com.distribuida.services;

import com.distribuida.dao.BooksRepository;
import com.distribuida.db.Books;
import jakarta.enterprise.context.ApplicationScoped;
import jakarta.inject.Inject;

import java.util.List;

@ApplicationScoped
public class BookServiceImpl implements BookService {

    @Inject
    private BooksRepository booksRepository;

    @Override
    public List<Books> findAll() {
        return booksRepository.findAll();
    }

    @Override
    public Books findById(Integer id) {
        return booksRepository.findById(id);
    }

    @Override
    public void save(Books books) {
        booksRepository.save(books);

    }

    @Override
    public void update(Books books) {
        if (findById(books.getId()).getId() != null && findById(books.getId()).getId() != 0) {
            booksRepository.update(books);
        }

    }

    @Override
    public void deleteByID(Integer id) {
        booksRepository.deleteById(id);
    }
}
