package com.system.system.repository;

import com.system.system.entity.Treino;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface TreinoRepository extends JpaRepository<Treino, UUID> {
    Optional<Treino> findByNomeAndUsuario_IdUsuario(
            String nome,
            UUID idUsuario
            //Busca uma treino pelo nome
    );
    boolean existsByNomeAndUsuario_IdUsuario(
            String nome,
            UUID idUsuario
            // Verifica se um treino existe
    );
    List<Treino> findByUsuario_IdUsuario(UUID idUsuario); //Lista todos os treinos de um usuário
}
