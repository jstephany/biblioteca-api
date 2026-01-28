package com.jstephany.biblioteca_api.controller;


import com.jstephany.biblioteca_api.model.Book;
import com.jstephany.biblioteca_api.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService service;

    @GetMapping
    public List<Book> listar() {
        return service.listarTodos();
    }

    @PostMapping
    public Book criar(@RequestBody Book book) {
        return service.salvar(book);
    }

    @DeleteMapping
    public void excluir(@PathVariable Long id) {
        service.deletar(id);
    }

}
