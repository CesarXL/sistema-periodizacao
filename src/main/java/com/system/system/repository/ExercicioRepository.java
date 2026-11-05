package com.system.system.repository;

import com.system.system.entity.Exercicio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface ExercicioRepository extends JpaRepository<Exercicio, UUID> {
    Optional<Exercicio> findByNomeAndUsuario_IdUsuario(
            String nome,
            UUID idUsuario
            // Busca exercício pelo nome, pertencente a determinado usuário
    );
    List<Exercicio> findByUsuarioIsNull(); //busca os exercicios globais
    List<Exercicio> findByUsuario_IdUsuario(UUID idUsuario); //busca os exercicios pertencentes a um usuario

    boolean existsByNomeAndUsuarioIsNull(String nome); // Verifica se já existe um exercício global com esse nome
    boolean existsByNomeAndUsuario_IdUsuario(
            String nome,
            UUID idUsuario
    );
}
