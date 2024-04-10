package br.com.projeto.api.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import br.com.projeto.api.Service.LivroService;
import br.com.projeto.api.model.Livro;

@RestController
@RequestMapping("/biblioteca")
public class LivroController {
    @Autowired
    private LivroService livroService;

    // Outros métodos do controller...

    @PostMapping("/livro")
    public ResponseEntity<Livro> cadastrarLivro(@RequestBody Livro livro) {
        Livro novoLivro = livroService.cadastrarLivro(livro);
        if (novoLivro != null) {
            return ResponseEntity.status(HttpStatus.CREATED).body(novoLivro);
        } else {
            return ResponseEntity.status(HttpStatus.INTERNAL_SERVER_ERROR).build();
        }
    }
}

