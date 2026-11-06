package com.system.system.service;

import com.system.system.entity.ExercicioTreino;

import java.util.List;
import java.util.UUID;

public interface ExercicioTreinoService {

    List<ExercicioTreino> listarExerciciosPorTreino(UUID idTreino);

}
