package br.com.alura.api.forum_hub.domain.dto;

import br.com.alura.api.forum_hub.domain.model.Topico;

import java.time.LocalDateTime;

public record DadosListagemTopico(Long id, String titulo, String mensagem, LocalDateTime dataCriacao, String status, String autor, String curso, String resposta) {
    public DadosListagemTopico(Topico topico){
        this(topico.getId(), topico.getTitulo(), topico.getMensagem(), topico.getDataCriacao(), topico.getStatus(), topico.getAutor(), topico.getCurso(), topico.getRespostas());
    }
}
