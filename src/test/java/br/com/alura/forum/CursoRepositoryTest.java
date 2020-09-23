package br.com.alura.forum;

import br.com.alura.forum.modelo.Curso;
import br.com.alura.forum.repository.CursoRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

@ExtendWith(SpringRunner.class)
@DataJpaTest
public class CursoRepositoryTest {

    @Autowired
    private CursoRepository repository;

    @Test
    public void  deveriaCarregarCursoBuscaPeloNome(){

        String nomeCurso= "HTML 5";
        Curso curso= repository.findByNome(nomeCurso);

        Assert
    }
}
