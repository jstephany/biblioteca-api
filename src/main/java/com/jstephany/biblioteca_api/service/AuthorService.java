package com.jstephany.biblioteca_api.service;


import com.jstephany.biblioteca_api.model.Author;
import com.jstephany.biblioteca_api.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuthorService {
    @Autowired
    private AuthorRepository repository;

    public List<Author> listarTodos() {
        return repository.findAll();
    }

    public Author salvar(Author author) {
        return repository.save(author);
    }

    public void deletar(Long id) {
        repository.deleteById(id);
    }
}
