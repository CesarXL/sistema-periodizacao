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
    private UUID id_periodizacao_treino;

    @Column(nullable = false)
    private LocalDate data_treino;

    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private Status status;

    @ManyToOne
    @JoinColumn(name = "id_periodizacao")
    private Periodizacao periodizacao;
    @ManyToOne
    @JoinColumn(name = "id_treino")
    private Treino treino;
}
