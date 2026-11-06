package com.system.system.service.implementation;

import com.system.system.entity.Periodizacao;
import com.system.system.repository.PeriodizacaoRepository;
import com.system.system.service.PeriodizacaoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class PeriodizacaoServiceImpl implements PeriodizacaoService {

    private final PeriodizacaoRepository periodizacaoRepository;

    @Override
    public Optional<Periodizacao> buscarPreiodizacaoPorNome(String nome, UUID idUsuario) {
        return periodizacaoRepository.findByNomeAndUsuario_IdUsuario(nome, idUsuario);
    }

    @Override
    public Optional<Periodizacao> buscarPreiodizacaoPorId(UUID idPeriodizacao) {
        return periodizacaoRepository.findById(idPeriodizacao);
    }

    @Override
    public List<Periodizacao> listarPeriodizacoesPorUsuario(UUID idUsuario) {
        return periodizacaoRepository.findByUsuario_IdUsuario(idUsuario);
    }

    @Override
    public Periodizacao cadastrarPeriodizacao(Periodizacao periodizacao) {
        return periodizacaoRepository.save(periodizacao);
    }

    @Override
    public Periodizacao atualizarPeriodizacao(Periodizacao periodizacao) {
        return periodizacaoRepository.save(periodizacao);
    }

    @Override
    public void excluirPeriodizacao(UUID idPeriodizacao) {
        periodizacaoRepository.deleteById(idPeriodizacao);
    }
}
