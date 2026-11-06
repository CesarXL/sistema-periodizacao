package com.system.system.service;

import com.system.system.entity.Exercicio;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface ExercicioService {
    List<Exercicio> listarExercicios();
    Optional<Exercicio> buscarExercicioGlobalPorNome(String nome);
    Optional<Exercicio> buscarExercicioUsuarioPorNome(String nome, UUID idUsuario);
    Optional<Exercicio> buscarExercicioPorId(UUID idExercicio);
    Exercicio cadastrarExercicio(Exercicio exercicio);
    Exercicio atualizarExercicio(Exercicio exercicio);
    void excluirExercicio(UUID idExercicio);
}
