package br.com.alura.api.forum_hub.domain.dto;

public record DadosAtualizacaoTopico(
        String titulo,
        String mensagem,
        String autor,
        String curso,
        String status,
        String resposta) {
}
