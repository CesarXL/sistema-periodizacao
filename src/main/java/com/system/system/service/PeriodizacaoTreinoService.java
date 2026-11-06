package com.system.system.service;

import com.system.system.entity.PeriodizacaoTreino;

import java.util.List;
import java.util.UUID;

public interface PeriodizacaoTreinoService {

    List<PeriodizacaoTreino> listarPeriodizacoesPorTreino(UUID idTreino);

}