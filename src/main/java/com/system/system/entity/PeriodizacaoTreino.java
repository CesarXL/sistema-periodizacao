package com.system.system.entity;

import com.system.system.entity.enums.Status;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "periodizacao_treino")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class PeriodizacaoTreino {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_periodizacao_treino")
    private UUID idPeriodizacaoTreino;

    @Column(nullable = false)
    private LocalDate dataTreino;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Status status;

    @ManyToOne
    @JoinColumn(name = "id_periodizacao", nullable = false)
    private Periodizacao periodizacao;
    @ManyToOne
    @JoinColumn(name = "id_treino", nullable = false)
    private Treino treino;
}
