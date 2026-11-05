package com.system.system.repository;

import com.system.system.entity.ExercicioNote;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface ExercicioNoteRepository extends JpaRepository<ExercicioNote, UUID> {
    List<ExercicioNote> findByPeriodizacaoTreino_IdPeriodizacaoTreino(UUID idPeriodizacaoTreino); // Buscar as anotações de um treino
}
