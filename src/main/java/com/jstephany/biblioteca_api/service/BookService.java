package com.jstephany.biblioteca_api.service;

import com.jstephany.biblioteca_api.model.Book;
import com.jstephany.biblioteca_api.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    @Autowired
    private BookRepository repository;

    public List<Book> listarTodos() {
        return repository.findAll();
    }

    public Book salvar(Book book) {
        return repository.save(book);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }

}
