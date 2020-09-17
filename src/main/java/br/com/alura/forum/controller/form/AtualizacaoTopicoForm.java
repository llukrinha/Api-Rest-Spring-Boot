package br.com.alura.forum.controller.form;

import br.com.alura.forum.modelo.Topico;
import br.com.alura.forum.repository.TopicoRepository;
import lombok.Data;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

@Data
public class AtualizacaoTopicoForm {

    @NotBlank
    @Size(min = 5)
    private String titulo;

    @NotBlank
    @Size(min = 10)
    private String mensagem;


    public Topico atualizar(Long id, TopicoRepository topicoRepository) {
        Topico topico= topicoRepository.getOne(id);
        topico.setTitulo(this.titulo);
        topico.setMensagem(this.mensagem);

        return topico;
    }
}
