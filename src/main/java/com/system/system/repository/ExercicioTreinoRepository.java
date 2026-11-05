package com.system.system.repository;

import com.system.system.entity.ExercicioTreino;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ExercicioTreinoRepository extends JpaRepository<ExercicioTreino, UUID> {
    List<ExercicioTreino> findByTreino_IdTreino(UUID idTreino); // Busca todos os exercicios de um treino
}
