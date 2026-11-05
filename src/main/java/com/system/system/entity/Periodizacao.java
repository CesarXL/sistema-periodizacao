package com.system.system.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;
import java.util.UUID;

@Entity
@Table(name = "periodizacao")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Periodizacao {

    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    @Column(name = "id_periodizacao")
    private UUID idPeriodizacao;

    @Column(nullable = false)
    private String nome;

    private String descricao;

    @Column(nullable = false)
    private LocalDate dataInicio;
    @Column(nullable = false)
    private LocalDate dataFim;

    @ManyToOne
    @JoinColumn(name = "id_usuario", nullable = false)
    private Usuario usuario;
}
