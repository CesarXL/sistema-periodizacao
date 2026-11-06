package com.system.system.service.implementation;

import com.system.system.entity.ExercicioTreino;
import com.system.system.repository.ExercicioTreinoRepository;
import com.system.system.service.ExercicioTreinoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ExercicioTreinoServiceImpl implements ExercicioTreinoService {

    private final ExercicioTreinoRepository exercicioTreinoRepository;

    @Override
    public List<ExercicioTreino> listarExerciciosPorTreino(UUID idTreino) {
        return exercicioTreinoRepository.findByTreino_IdTreino(idTreino);
    }
}
