package br.com.alura.forum.controller.form;

import br.com.alura.forum.modelo.Curso;
import br.com.alura.forum.modelo.Topico;
import br.com.alura.forum.repository.CursoRepository;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
public class TopicoForm {

    @NotBlank
    @Size(min = 5)
    private String titulo;

    @NotBlank
    @Size(min = 10)
    private String mensagem;

    @NotBlank
    private String nomeCurso;

    public Topico converter(CursoRepository cursoRepository) {
        Curso curso = cursoRepository.findByNome(nomeCurso);
        return new Topico(titulo, mensagem, curso);
    }
}
