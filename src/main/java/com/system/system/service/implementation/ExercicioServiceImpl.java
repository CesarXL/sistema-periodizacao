package com.system.system.service.implementation;

import com.system.system.entity.Exercicio;
import com.system.system.repository.ExercicioRepository;
import com.system.system.service.ExercicioService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class ExercicioServiceImpl implements ExercicioService {

    private final ExercicioRepository exercicioRepository;

    @Override
    public List<Exercicio> listarExercicios() {
        return exercicioRepository.findAll();
    }

    @Override
    public Optional<Exercicio> buscarExercicioGlobalPorNome(String nome) {
        return exercicioRepository.findByNomeAndUsuarioIsNull(nome);
    }

    @Override
    public Optional<Exercicio> buscarExercicioUsuarioPorNome(String nome, UUID idUsuario) {
        return exercicioRepository.findByNomeAndUsuario_IdUsuario(nome, idUsuario);
    }

    @Override
    public Optional<Exercicio> buscarExercicioPorId(UUID idExercicio) {
        return exercicioRepository.findById(idExercicio);
    }

    @Override
    public Exercicio cadastrarExercicio(Exercicio exercicio) {
        return exercicioRepository.save(exercicio);
    }

    @Override
    public Exercicio atualizarExercicio(Exercicio exercicio) {

        if (!exercicioRepository.existsById(exercicio.getIdExercicio())) {
            throw new RuntimeException("Exercício não encontrado!");
        }

        return exercicioRepository.save(exercicio);
    }

    @Override
    public void excluirExercicio(UUID idExercicio) {
        exercicioRepository.deleteById(idExercicio);
    }
}
