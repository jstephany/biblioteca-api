package com.jstephany.biblioteca_api.controller;

import com.jstephany.biblioteca_api.model.Author;
import com.jstephany.biblioteca_api.service.AuthorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController //diz que a classe é uma rota API que devolve JSON
@RequestMapping("/authors")
public class AuthorController {
    @Autowired
    private AuthorService service;

    @GetMapping // buscar
    public List<Author> listar() {
        return service.listarTodos();
    }

    @PostMapping // cadastrar novas info
    public Author criar(@RequestBody Author author) {
        // transforma JSON em Obj
        return service.salvar(author);
    }

    @DeleteMapping
    public void excluir(@PathVariable Long id) {
        service.deletar(id);
    }

}
