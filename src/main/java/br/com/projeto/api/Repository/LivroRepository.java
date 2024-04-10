package br.com.projeto.api.Repository;

import java.util.List;
import java.util.Optional;

import br.com.projeto.api.model.Livro;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LivroRepository extends JpaRepository<Livro, Long> {


    @SuppressWarnings("null")
    public default List<Livro> findAll() {
        throw new UnsupportedOperationException("Unimplemented method 'findAll'");
    }

    @SuppressWarnings("null")
    public default Optional<Livro> findById(Long id) {
        throw new UnsupportedOperationException("Unimplemented method 'findById'");
    }

    @SuppressWarnings({ "unchecked", "null" })
    public default Livro save(Livro livro) {
        throw new UnsupportedOperationException("Unimplemented method 'save'");
    }

    public default void deleteById(@SuppressWarnings("null") Long id) {
     throw new UnsupportedOperationException("Unimplemented method 'deleteById'");
    }

}
