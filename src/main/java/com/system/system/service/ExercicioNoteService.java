package com.system.system.service;

import com.system.system.entity.ExercicioNote;

import java.util.List;
import java.util.UUID;

public interface ExercicioNoteService {

    List<ExercicioNote> listarAnotacoesPorTreino(UUID idPeriodizacaoTreino);

}
