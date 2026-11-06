package com.system.system.service.implementation;

import com.system.system.entity.ExercicioNote;
import com.system.system.repository.ExercicioNoteRepository;
import com.system.system.service.ExercicioNoteService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ExercicioNoteServiceImpl implements ExercicioNoteService {

    private final ExercicioNoteRepository exercicioNoteRepository;

    @Override
    public List<ExercicioNote> listarAnotacoesPorTreino(UUID idPeriodizacaoTreino) {
        return exercicioNoteRepository.findByPeriodizacaoTreino_IdPeriodizacaoTreino(idPeriodizacaoTreino);
    }
}
