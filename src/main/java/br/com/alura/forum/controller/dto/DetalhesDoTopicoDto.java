package br.com.alura.forum.controller.dto;

import br.com.alura.forum.modelo.StatusTopico;
import br.com.alura.forum.modelo.Topico;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class DetalhesDoTopicoDto {

    private Long id;
    private String titulo;
    private String mensagem;
    private LocalDateTime dataCriacao;
    private String nomeAutor;
    private StatusTopico status;
    private List<RespostaDto> respostas;

    public DetalhesDoTopicoDto(Topico topico){
        this.id = resposta.getId();
        this.mensagem = resposta.getMensagen();
        this.dataCriacao = resposta.getDataCriacao();
        this.nomeAutor = resposta.getAutor().getNome();
        this.status=topico.getStatus();
        this.respostas= new ArrayList<>();
        this.respostas.addAll(topico.getResposta().strem().)
    }

}
