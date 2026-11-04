package com.system.system.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.UUID;
@Entity
@Table(name = "exercicio_treino")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ExercicioTreino {
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_exercicio_treino")
    private UUID id_exercicio_treino;

    @Column(nullable = false)
    private int series;

    @Column(nullable = false)
    private int repeticoes;

    private int carga;

    @ManyToOne
    @JoinColumn(name = "id_execicio", nullable = false)
    private Exercicio exercicio;

    @ManyToOne
    @JoinColumn(name = "id_treino", nullable = false)
    private Treino treino;
}
