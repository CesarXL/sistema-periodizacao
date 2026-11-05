package com.system.system.repository;

import com.system.system.entity.PeriodizacaoTreino;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.UUID;

@Repository
public interface PeriodizacaoTreinoRepository extends JpaRepository<PeriodizacaoTreino, UUID> {
    List<PeriodizacaoTreino> findByPeriodizacao_IdPeriodizacao(UUID idPeriodizacao); // Busca todos os treinos de uma periodização
}
