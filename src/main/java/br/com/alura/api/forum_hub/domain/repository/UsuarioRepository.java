package br.com.alura.api.forum_hub.domain.repository;

import br.com.alura.api.forum_hub.domain.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.security.core.userdetails.UserDetails;

public interface UsuarioRepository extends JpaRepository<Usuario, Long> {
    UserDetails findByLogin(String login); // Faz a consulta no banco de dados
}
