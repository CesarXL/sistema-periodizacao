package com.system.system.service;

import com.system.system.entity.Periodizacao;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface PeriodizacaoService {
    Optional<Periodizacao> buscarPreiodizacaoPorNome(String nome, UUID idUsuario);
    Optional<Periodizacao> buscarPreiodizacaoPorId(UUID idPeriodizacao);
    List<Periodizacao> listarPeriodizacoesPorUsuario(UUID idUsuario);
    Periodizacao cadastrarPeriodizacao(Periodizacao periodizacao);
    Periodizacao atualizarPeriodizacao(Periodizacao periodizacao);
    void excluirPeriodizacao(UUID idPeriodizacao);
}
