package br.com.projeto.api.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import br.com.projeto.api.Repository.LivroRepository;
import br.com.projeto.api.model.Livro;

import java.util.List;
import java.util.Optional;

@Service
public class LivroService {

    @Autowired
    private LivroRepository livroRepository;

    public List<Livro> listarLivros() {
        return livroRepository.findAll();
    }

    public ResponseEntity<Livro> buscarLivroPorId(Long id) {
        Optional<Livro> optionalLivro = Optional.empty();
        if (optionalLivro.isPresent()) {
            return ResponseEntity.ok(optionalLivro.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }
    

    public Livro cadastrarLivro(Livro livro) {
        return livroRepository.save(livro);
    }

    public Livro atualizarLivro(Long id, Livro livroAtualizado) {
        livroAtualizado.setId(id);
        return livroRepository.save(livroAtualizado);
    }

    public void excluirLivro(Long id) {
        livroRepository.deleteById(id);
    }
}
