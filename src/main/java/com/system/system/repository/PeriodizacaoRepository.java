package com.system.system.repository;

import com.system.system.entity.Periodizacao;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Repository
public interface PeriodizacaoRepository extends JpaRepository<Periodizacao, UUID> {
    Optional<Periodizacao> findByNomeAndUsuario(
            String nome,
            UUID idUsuario
    );

    boolean existsByNomeAndUsuario_IdUsuario(
            String nome,
            UUID idUsuario
    );

    List<Periodizacao> findByUsuario_IdUsuario(UUID idUsuario);

}
