package br.com.alura.api.forum_hub.domain.repository;

import br.com.alura.api.forum_hub.domain.model.Topico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TopicoRepository extends JpaRepository<Topico, Long> {
}
