package com.system.system.service.implementation;

import com.system.system.entity.PeriodizacaoTreino;
import com.system.system.repository.PeriodizacaoTreinoRepository;
import com.system.system.service.PeriodizacaoTreinoService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.UUID;

@Service
@RequiredArgsConstructor
public class PeriodizacaoTreinoServiceeImpl implements PeriodizacaoTreinoService {

    private final PeriodizacaoTreinoRepository periodizacaoTreinoRepository;

    @Override
    public List<PeriodizacaoTreino> listarPeriodizacoesPorTreino(UUID idTreino) {
        return periodizacaoTreinoRepository.findByPeriodizacao_IdPeriodizacao(idTreino);
    }
}
