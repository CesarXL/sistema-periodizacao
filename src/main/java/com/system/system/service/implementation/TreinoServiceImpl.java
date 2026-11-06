package com.system.system.service.implementation;

import com.system.system.entity.Treino;
import com.system.system.repository.TreinoRepository;
import com.system.system.service.TreinoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class TreinoServiceImpl implements TreinoService {

    private final TreinoRepository treinoRepository;

    @Override
    public Optional<Treino> buscarTreinoPorNome(String nome, UUID idUsuario) {
        return treinoRepository.findByNomeAndUsuario_IdUsuario(nome, idUsuario);
    }

    @Override
    public Optional<Treino> buscarTreinoPorId(UUID idTreino) {
        return treinoRepository.findById(idTreino);
    }

    @Override
    public List<Treino> listarTreinosPorUsuario(UUID idUsuario) {
        return treinoRepository.findByUsuario_IdUsuario(idUsuario);
    }

    @Override
    public Treino cadastrarTreino(Treino treino) {
        return treinoRepository.save(treino);
    }

    @Override
    public Treino atualizarTreino(Treino treino) {
        return treinoRepository.save(treino);
    }

    @Override
    public void excluirTreino(UUID idTreino) {
        treinoRepository.deleteById(idTreino);
    }
}
