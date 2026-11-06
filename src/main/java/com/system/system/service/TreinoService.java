package com.system.system.service;

import com.system.system.entity.Treino;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface TreinoService {
    Optional<Treino> buscarTreinoPorNome(String nome, UUID idUsuario);
    Optional<Treino> buscarTreinoPorId(UUID id);
    List<Treino> listarTreinosPorUsuario(UUID idUsuario);
    Treino cadastrarTreino(Treino treino);
    Treino atualizarTreino(Treino treino);
    void excluirTreino(UUID idTreino);
}
